package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.controller;

import lombok.RequiredArgsConstructor;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.FirearmDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.model.Firearm;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.FirearmService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: handles ferrying of firearms-related data to and from the front end.
 */
@RestController
@RequiredArgsConstructor
public class FirearmController {
    private final FirearmService firearmService;

    @GetMapping("/api/firearms/all")
    public ResponseEntity<List<FirearmDetailsDTO>> findAllFirearms(){
        return ResponseEntity.ok(firearmService.findAll());
    }

    @PostMapping("/api/firearms/new")
    public ResponseEntity<?> addFirearm(@RequestBody FirearmDetailsDTO firearmDetailsDTO){
        firearmService.addFirearm(firearmDetailsDTO);
        return ResponseEntity.ok("Firearm added to database.");
    }

    @PutMapping("/api/firearms/update")
    public ResponseEntity<?> updateFirearm(@RequestBody FirearmDetailsDTO firearmDetailsDTO){
        firearmService.addFirearm(firearmDetailsDTO);
        return ResponseEntity.ok("Firearm updated.");
    }

    @DeleteMapping("/api/firearm/{firearmName}/delete")
    public ResponseEntity<?> deleteFirearm(@PathVariable("firearmName") String name){
        FirearmDetailsDTO firearmToBeRemoved = firearmService.findFirearmByName(name);
        firearmService.removeFirearm(firearmToBeRemoved.getFirearmID());
        return ResponseEntity.ok(String.format("%s removed from database.", name));
    }

}