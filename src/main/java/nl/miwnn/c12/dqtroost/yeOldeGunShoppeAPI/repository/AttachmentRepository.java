package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.repository;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 */
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}