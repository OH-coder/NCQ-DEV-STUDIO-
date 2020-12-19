package tn.iit.store.factory;

import tn.iit.dto.MedicationDTO;
import tn.iit.store.models.Medication;

public class MedicationFactory {
    public static Medication MedCategoryDtoToEntity(MedicationDTO medDTO) {
       Medication medication=new Medication();
       medication.setName(medDTO.getName());
       medication.setPrice(medDTO.getPrice());

       return medication;
    }
    public static MedicationDTO  EntityToMedicationDto(Medication medication) {
        MedicationDTO medicationDTO=new MedicationDTO();
        medicationDTO.setName(medication.getName());
        medicationDTO.setPrice(medication.getPrice());
        return medicationDTO;
    }
}
