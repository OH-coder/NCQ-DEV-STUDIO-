package tn.iit.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.Size;

public class MedicalFileDTO {

	private Integer id;
	@Size(min=1, max=100)
	private String patientName;
	private LocalDateTime admissionDate;
	private List<PrescriptionMedicalDTO> prescriptionMedicals;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public LocalDateTime getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDateTime admissionDate) {
		this.admissionDate = admissionDate;
	}
	public List<PrescriptionMedicalDTO> getPrescriptionMedicals() {
		return prescriptionMedicals;
	}
	public void setPrescriptionMedicals(List<PrescriptionMedicalDTO> prescriptionMedicals) {
		this.prescriptionMedicals = prescriptionMedicals;
	}
	
	
}
