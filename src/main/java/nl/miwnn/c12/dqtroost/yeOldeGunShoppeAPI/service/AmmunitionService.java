package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AmmunitionDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Ammunition;

import java.util.List;


/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program
 */
public interface AmmunitionService {
    List<AmmunitionDetailsDTO> findAll();
    void addAmmunition(AmmunitionDetailsDTO ammunition);
    void removeAmmunition(Long ammunitionID);

} // end of AmmunitionService