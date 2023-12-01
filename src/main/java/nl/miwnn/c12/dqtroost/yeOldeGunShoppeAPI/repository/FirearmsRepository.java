package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.repository;

import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Firearm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 */
public interface FirearmsRepository extends JpaRepository<Firearm, Long> {
    Optional<Firearm> findFirearmByName(String name);
}