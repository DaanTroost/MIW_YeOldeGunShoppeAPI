package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.repository;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Ammunition;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 */
public interface AmmunitionRepository extends JpaRepository<Ammunition, Long> {
}