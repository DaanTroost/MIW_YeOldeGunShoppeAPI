package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.implementations;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AmmunitionDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.repository.AmmunitionRepository;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.AmmunitionService;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.mapper.AmmunitionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * connect to ammunition records in the DB
 */
@Service
public class AmmunitionServiceMySQL implements AmmunitionService {
    private final AmmunitionRepository ammunitionRepository;
    private final AmmunitionMapper ammunitionMapper;

    public AmmunitionServiceMySQL(AmmunitionRepository ammunitionRepository,
                                  AmmunitionMapper ammunitionMapper){
        this.ammunitionRepository = ammunitionRepository;
        this.ammunitionMapper = ammunitionMapper;
    }


    @Override
    public List<AmmunitionDetailsDTO> findAll() {
        return ammunitionMapper.toDTOList(ammunitionRepository.findAll());
    }

    @Override
    public void addAmmunition(AmmunitionDetailsDTO ammunition) {
        ammunitionRepository.save(ammunitionMapper.toModel(ammunition));
    }

    @Override
    public void removeAmmunition(Long ammunitionID) {
        ammunitionRepository.deleteById(ammunitionID);
    }
} // end of AmmunitionServiceMySQL