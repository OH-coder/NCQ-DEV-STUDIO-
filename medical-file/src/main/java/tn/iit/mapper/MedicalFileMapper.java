package tn.iit.mapper;


import tn.iit.dto.MedicalFileDTO;
import tn.iit.models.MedicalFile;

public class MedicalFileMapper {

	public static MedicalFileDTO medicalFileToMedicalFileDTO(MedicalFile medicalFile) {
		MedicalFileDTO medicalFileDTO = new MedicalFileDTO();
		medicalFileDTO.setId(medicalFile.getId());
		medicalFileDTO.setPatientName(medicalFile.getPatientName());
		medicalFileDTO.setAdmissionDate(medicalFile.getAdmissionDate());
		medicalFileDTO
				.setPrescribedMedications(prescribedmedicationToPrescribedMedicationDTO(medicalFile.getMedications()));
		return medicalFileDTO;
	}

	public static MedicalFile medicalFileDTOToMedicalFile(MedicalFileDTO medicalFileDTO) {
		MedicalFile medicalFile = new MedicalFile();
		medicalFile.setId(medicalFileDTO.getId());
		medicalFile.setPatientName(medicalFileDTO.getPatientName());
		medicalFile.setAdmissionDate(medicalFileDTO.getAdmissionDate());
		medicalFile.setMedication(medicalFileDTO.getPrescribedMedications()
				.stream().map(medicationDTO -> 
				PrescriptionMedical medication = prescribedmedicationDTOToPrescribedMedication(medicationDTO);
				medication.setMedicalFile(medicalFile);
				return medication;
	}).collect(Collectors.toList())
				);
	return medicalFileDTO;
}

}
