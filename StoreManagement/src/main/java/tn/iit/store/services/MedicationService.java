package tn.iit.store.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.store.exception.ResourceNotFoundException;
import tn.iit.store.models.Medication;
import tn.iit.store.repositories.MedicationRepository;

@Service
public class MedicationService {

	    private  final MedicationRepository medicationRepository;

	public MedicationService(MedicationRepository medicationRepository) {
		this.medicationRepository = medicationRepository;
	}

	public Medication saveArticle(Medication article) {
	        return medicationRepository.save(article);
	    }
	    
	    public List<Medication> getArticles() {
	        return StreamSupport.stream(medicationRepository.findAll().spliterator(),false).collect(Collectors.toList());
	    }


	    public Medication getFileById(int id) {

			return medicationRepository.findById(id).orElseThrow(()->new ResourceNotFoundException(id));
	    }
	    
	    public String deleteArticle(int id) {
	    	Medication medication=getFileById(id);
	    	medicationRepository.delete(medication);
	        return "Article deleted !! " + id;
	    }
	    public  Medication updateArticle(int id,Medication medication){
	    	Medication med=getFileById(id);
	    	med.setId(medication.getId());
	    	med.setPrice(medication.getPrice());
	    	med.setName(med.getName());
	    	med.setCategory(medication.getCategory());
	    	return med;
		}
}
