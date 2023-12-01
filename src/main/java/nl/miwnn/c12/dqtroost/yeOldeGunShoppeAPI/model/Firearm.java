package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: establishes records for firearms in the DB.
 * firearms have, other than the usual, a list of available ammunition calibres, and a list of
 * available attachments.
 */

@Entity
@Data
public class Firearm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long firearmID;

    private String name;
    private String manufacturer;

    @ManyToMany
    private List<Ammunition> chamberedFor;

}