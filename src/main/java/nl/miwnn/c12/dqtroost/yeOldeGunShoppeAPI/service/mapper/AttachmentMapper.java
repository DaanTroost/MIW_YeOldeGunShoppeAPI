package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.mapper;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AmmunitionDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AttachmentDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Ammunition;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Attachment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program
 */
@Component
public class AttachmentMapper {
    public AttachmentDetailsDTO toDTO (Attachment attachment){
        return AttachmentDetailsDTO.builder()
                .attachmentID(attachment.getAttachmentID())
                .name(attachment.getName())
                .manufacturer(attachment.getManufacturer())
                .location(attachment.getLocation())
                .build();
    }
    public List<AttachmentDetailsDTO> toDTOList(List<Attachment> model){
        return model.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Attachment toModel(AttachmentDetailsDTO dto){
        Attachment model = new Attachment();

        model.setAttachmentID(dto.getAttachmentID());
        model.setName(dto.getName());
        model.setLocation(dto.getLocation());
        model.setManufacturer(dto.getManufacturer());

        return model;
    }
}