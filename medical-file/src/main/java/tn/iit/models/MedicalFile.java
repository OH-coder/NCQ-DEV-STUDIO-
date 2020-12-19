package tn.iit.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class MedicalFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Size(min=1, max=100)
	@Column(name="patientName")
	private String patientName;
	
	@NotNull
	@Column(name="admissionDate")
	private LocalDateTime admissionDate;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medicalFile", fetch = FetchType.LAZY)
	private List<PrescriptionMedication> medications;

	public LocalDateTime getAdmissionDate() { return admissionDate; }

	public void setAdmissionDate(LocalDateTime admissionDate) { this.admissionDate = admissionDate; }

	public List<PrescriptionMedication> getMedications() { return medications; }

	public void setMedications(List<PrescriptionMedication> medications) { this.medications = medications; }

	
	public Integer getId() { return id; }

	public void setId(Integer id) { this.id = id; }

	public MedicalFile() {}
	
	
	
	
	
	
	
	
}
