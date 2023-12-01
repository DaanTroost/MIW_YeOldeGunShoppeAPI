package nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.controller;

import lombok.RequiredArgsConstructor;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.dto.AttachmentDetailsDTO;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.AmmunitionService;
import nl.miwnn.c12.dqtroost.yeOldeGunShoppeAPI.service.AttachmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: ferries attachment data from the backend to the frontend and back.
 */
@RestController
@RequiredArgsConstructor
public class AttachmentController {
    private final AttachmentService attachmentService;

    @GetMapping("/api/attachments/all")
    public ResponseEntity<List<AttachmentDetailsDTO>> allAttachments(){
        return ResponseEntity.ok(attachmentService.findAll());
    }

    @PostMapping("/api/attachments/new")
    public ResponseEntity<?> saveAmmunition(@RequestBody AttachmentDetailsDTO attachmentDetailsDTO){
        attachmentService.addAttachment(attachmentDetailsDTO);
        return ResponseEntity.ok("Attachment added.");
    }

    @PutMapping("/api/attachments/update")
    public ResponseEntity<?> updateAmmunition(@RequestBody AttachmentDetailsDTO attachmentDetailsDTO){
        attachmentService.addAttachment(attachmentDetailsDTO);
        return ResponseEntity.ok("Attachment updated");
    }

    @DeleteMapping("/api/attachments/{attachmentID}/delete")
    public ResponseEntity<?> deleteAmmunition(@PathVariable("attachmentID") Long attachmentID){
        attachmentService.removeAttachment(attachmentID);
        return ResponseEntity.ok("Attachment removed.");
    }
}