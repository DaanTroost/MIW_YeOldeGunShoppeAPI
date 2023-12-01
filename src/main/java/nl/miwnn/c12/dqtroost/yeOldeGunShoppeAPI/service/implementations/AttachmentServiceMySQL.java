package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.implementations;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AttachmentDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.repository.AttachmentRepository;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.AttachmentService;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.mapper.AttachmentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: queries the DB for attachment data.
 */
@Service
public class AttachmentServiceMySQL implements AttachmentService {
    private final AttachmentMapper attachmentMapper;
    private final AttachmentRepository attachmentRepository;

    public AttachmentServiceMySQL(AttachmentRepository attachmentRepository,
                                  AttachmentMapper attachmentMapper){
        this.attachmentRepository = attachmentRepository;
        this.attachmentMapper = attachmentMapper;
    }

    @Override
    public List<AttachmentDetailsDTO> findAll() {
        return attachmentMapper.toDTOList(attachmentRepository.findAll());
    }

    @Override
    public void addAttachment(AttachmentDetailsDTO attachment) {
        attachmentRepository.save(attachmentMapper.toModel(attachment));
    }

    @Override
    public void removeAttachment(Long attachmentID) {
        attachmentRepository.deleteById(attachmentID);
    }
}