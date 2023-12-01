package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.implementations;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.FirearmDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Ammunition;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Firearm;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.repository.FirearmsRepository;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.FirearmService;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.mapper.FirearmMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program
 */
@Service
public class FirearmServiceMySQL implements FirearmService {
    private final FirearmMapper firearmMapper;
    private final FirearmsRepository firearmsRepository;

    public FirearmServiceMySQL(FirearmsRepository firearmsRepository, FirearmMapper firearmMapper){
        this.firearmMapper = firearmMapper;
        this.firearmsRepository = firearmsRepository;
    }


    @Override
    public List<FirearmDetailsDTO> findAll() {
        return firearmMapper.toDTOList(firearmsRepository.findAll());
    }

    @Override
    public FirearmDetailsDTO findFirearmByName(String name){
        Optional<Firearm> firearm = firearmsRepository.findFirearmByName(name);
        if (firearm.isEmpty()){
            throw new RuntimeException("No such firearm found.");
        }
        return firearmMapper.toDTO(firearm.get());

    }

    @Override
    public void addFirearm(FirearmDetailsDTO firearmDetailsDTO) {
        firearmsRepository.save(firearmMapper.toModel(firearmDetailsDTO));
    }

    @Override
    public void removeFirearm(Long firearmID) {
        firearmsRepository.deleteById(firearmID);
    }

    @Override
    public List<Ammunition> findAllChamberVariants(Long firearmsID) {
        Optional<Firearm> firearm = firearmsRepository.findById(firearmsID);
        if (firearm.isEmpty()){
            throw new RuntimeException();
        }
        return firearm.get().getChamberedFor();

    }


}