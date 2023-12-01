package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AttachmentDetailsDTO;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: keeps track of all the ways we want to be able to query the DB for attachments
 */
public interface AttachmentService {
    List<AttachmentDetailsDTO> findAll();

    void addAttachment(AttachmentDetailsDTO attachment);

    void removeAttachment(Long attachmentID);
}