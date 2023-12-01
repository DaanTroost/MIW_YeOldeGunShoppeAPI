package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.FirearmDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Ammunition;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Firearm;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program
 */
public interface FirearmService {
    List<FirearmDetailsDTO> findAll();

    FirearmDetailsDTO findFirearmByName(String name);

    void addFirearm(FirearmDetailsDTO firearmDetailsDTO);

    void removeFirearm(Long firearmID);

    List<Ammunition> findAllChamberVariants(Long firearmsID);
}