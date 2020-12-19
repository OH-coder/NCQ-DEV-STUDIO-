package tn.iit.store.factory;

import tn.iit.dto.MedCategoryDTO;
import tn.iit.dto.MedCategoryDTO;
import tn.iit.store.models.MedicationCategory;
import tn.iit.store.models.MedicationCategory;

public class MedCategoryFactory {
    public static MedicationCategory MedicationDtoToEntity(MedCategoryDTO medDTO) {
        MedicationCategory medicationCategory=new MedicationCategory();
        medicationCategory.setName(medDTO.getName());
        return medicationCategory;
    }
    public static MedCategoryDTO  EntityToMedicationDto(MedicationCategory medication) {
        MedCategoryDTO medCategoryDTO=new MedCategoryDTO();
        medCategoryDTO.setName(medication.getName());
        return medCategoryDTO;
    }
}
