package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.controller;

import lombok.RequiredArgsConstructor;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AmmunitionDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.AmmunitionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: handles presenting ammunition data to and from the front end.
 */
@RestController
@RequiredArgsConstructor
public class AmmunitionController {

    private final AmmunitionService ammunitionService;

    @GetMapping("/api/ammunition")
    public ResponseEntity<List<AmmunitionDetailsDTO>> allAmmunition(){
        return ResponseEntity.ok(ammunitionService.findAll());
    }

    @PostMapping("/api/ammunition/new")
    public ResponseEntity<?> saveAmmunition(@RequestBody AmmunitionDetailsDTO ammunitionDetailsDTO){
        ammunitionService.addAmmunition(ammunitionDetailsDTO);
        return ResponseEntity.ok("Ammunition added.");
    }

    @PutMapping("/api/ammunition/update")
    public ResponseEntity<?> updateAmmunition(@RequestBody AmmunitionDetailsDTO ammunitionDetailsDTO){
        ammunitionService.addAmmunition(ammunitionDetailsDTO);
        return ResponseEntity.ok("Ammunition updated");
    }

    @DeleteMapping("/api/ammunition/{ammunitionID}/delete")
    public ResponseEntity<?> deleteAmmunition(@PathVariable("ammunitionID") Long ammunitionID){
        ammunitionService.removeAmmunition(ammunitionID);
        return ResponseEntity.ok("Ammunition removed.");
    }


} // end of AmmunitionController