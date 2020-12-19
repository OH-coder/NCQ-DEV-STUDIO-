package tn.iit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class PrescriptionMedication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "medicationId")
	private Integer medicationId;
	
	@NotNull
	@Column(name="price")
	private float price;
	
	@ManyToOne
	@JoinColumn(name="medicalFile", referencedColumnName="id")
	@NotNull
	private MedicalFile medicalFile;
	
	public PrescriptionMedication() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMedicationId() {
		return medicationId;
	}

	public void setMedicationId(Integer medicationId) {
		this.medicationId = medicationId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public MedicalFile getMedicalFile() {
		return medicalFile;
	}

	public void setMedicalFile(MedicalFile medicalFile) {
		this.medicalFile = medicalFile;
	}
	
	
}
