package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.mapper;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.FirearmDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Firearm;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program
 */
@Component
public class FirearmMapper {
    public FirearmDetailsDTO toDTO (Firearm firearm){
        return FirearmDetailsDTO.builder()
                .firearmID(firearm.getFirearmID())
                .name(firearm.getName())
                .manufacturer(firearm.getManufacturer())
                .chamberedFor(firearm.getChamberedFor())
                .build();
    }
    public List<FirearmDetailsDTO> toDTOList(List<Firearm> model){
        return model.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Firearm toModel(FirearmDetailsDTO dto){
        Firearm model = new Firearm();

        model.setFirearmID(dto.getFirearmID());
        model.setName(dto.getName());
        model.setManufacturer(dto.getManufacturer());
        model.setChamberedFor(dto.getChamberedFor());

        return model;
    }
}