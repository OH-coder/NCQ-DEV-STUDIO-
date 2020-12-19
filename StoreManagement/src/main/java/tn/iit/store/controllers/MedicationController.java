package tn.iit.store.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.iit.dto.MedicationDTO;
import tn.iit.store.factory.MedicationFactory;
import tn.iit.store.models.Medication;
import tn.iit.store.services.MedicationService;

@RequestMapping(value = "api/article")
@RestController
public class MedicationController {
	private final MedicationService medicationService;

    public MedicationController(MedicationService medicationService){
    	this.medicationService=medicationService;
	}
@PostMapping
	public ResponseEntity<MedicationDTO> addMedication(@RequestBody final  MedicationDTO medicationDTO){
	Medication medication=medicationService.saveArticle(MedicationFactory.MedCategoryDtoToEntity(medicationDTO));
	return new ResponseEntity<>(MedicationFactory.EntityToMedicationDto(medication), HttpStatus.CREATED);
}

}
