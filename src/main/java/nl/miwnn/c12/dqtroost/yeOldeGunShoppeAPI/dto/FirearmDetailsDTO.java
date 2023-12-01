package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Ammunition;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: presents and retrieves firearms-related data to and from the front end.
 */
@Getter @Setter @Builder
public class FirearmDetailsDTO {
    private Long firearmID;
    private String name;
    private String manufacturer;
    private List<Ammunition> chamberedFor;
}