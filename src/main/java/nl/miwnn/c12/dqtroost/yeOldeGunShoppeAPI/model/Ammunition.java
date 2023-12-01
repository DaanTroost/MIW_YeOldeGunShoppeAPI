package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * keeps track of ammunition-related data stored in the DB.
 */
@Entity
@Data
public class Ammunition {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ammunitionID;

    private String name;
} // end of Ammunition