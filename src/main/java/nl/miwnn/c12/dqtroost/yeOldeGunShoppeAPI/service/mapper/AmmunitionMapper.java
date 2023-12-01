package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.mapper;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AmmunitionDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Ammunition;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Maps ammunition models to ammunition DTOs, bidirectional
 */
@Component
public class AmmunitionMapper {

    public AmmunitionDetailsDTO toDTO (Ammunition ammo){
        return AmmunitionDetailsDTO.builder()
                .ammunitionID(ammo.getAmmunitionID())
                .name(ammo.getName())
                .build();
    }
    public List<AmmunitionDetailsDTO> toDTOList(List<Ammunition> model){
        return model.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Ammunition toModel(AmmunitionDetailsDTO dto){
        Ammunition model = new Ammunition();

        model.setAmmunitionID(dto.getAmmunitionID());
        model.setName(dto.getName());

        return model;
    }

} // end of AmmunitionMapper