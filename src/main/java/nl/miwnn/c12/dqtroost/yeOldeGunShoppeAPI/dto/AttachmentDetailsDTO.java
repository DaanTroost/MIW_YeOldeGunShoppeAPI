package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: ferries data from the service to the front-end and back.
 */
@Getter @Setter @Builder
public class AttachmentDetailsDTO {
    private Long attachmentID;
    private String name;
    private String manufacturer;
    private String location;
}