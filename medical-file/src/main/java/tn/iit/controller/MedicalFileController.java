package tn.iit.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.apache.xerces.internal.util.URI;

import tn.iit.dto.MedicalFileDTO;
import tn.iit.service.MedicalFileService;

@RequestMapping("/api")
@RestController
public class MedicalFileController {
	
	
	private final MedicalFileService medicalFileService;
	
	public MedicalFileController(MedicalFileService medicalFileService) { this.medicalFileService = medicalFileService; }

	@PutMapping("/medicalfiles/{id}")
	public ResponseEntity<MedicalFileDTO> updateMedicalFile(@PathVariable Integer id,
			@Valid @RequestBody MedicalFileDTO medicalFileDTO) {
		medicalFileDTO.setId(id);
		MedicalFileDTO result = medicalFileService.update(medicalFileDTO);
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("/medicalfiles/{id}")
	public ResponseEntity<MedicalFileDTO> getMedicalFile(@PathVariable Integer id){
		MedicalFileDTO dto = medicalFileService.findOne(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping("/medicalfiles")
	public Collection<MedicalFileDTO> getAllMedicalFiles(){
		return medicalFileService.findAll();
	}
	
	@PostMapping("/medicalfiles")
	public ResponseEntity<MedicalFileDTO> createMedicalFile (@Valid @RequestBody MedicalFileDTO medicalFileDTO){
		if(medicalFileDTO.getId() != null) {
			//error
		}
		MedicalFileDTO result = medicalFileService.save(medicalFileDTO);
		return ResponseEntity.created(new URI("/api/medicalfiles/"+result.getId())).body(result);
	}
	
	@DeleteMapping("/medicalfiles/{id}")
	public ResponseEntity<Void> deleteMedicalFile(@PathVariable Integer id){
		medicalFileService.delete(id);
		return ResponseEntity.ok().build();
	}
}
















