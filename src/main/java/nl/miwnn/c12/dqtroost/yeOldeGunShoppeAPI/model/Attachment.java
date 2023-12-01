package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: manages the keeping of records related to attachemnts
 * attachments do not know for which weapons they are designed.
 */

@Entity
@Data
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attachmentID;

    private String name;
    private String manufacturer;
    private String location;
}