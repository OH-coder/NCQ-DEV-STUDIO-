package tn.iit.dto;

import javax.validation.constraints.NotNull;

public class PrescriptionMedicalDTO {
	private Integer id;

	private Integer medicationId;

	@NotNull
	private float price;

	private String medicationName;
	private String medicationCategory;
	
	
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
	public String getMedicationName() {
		return medicationName;
	}
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	public String getMedicationCategory() {
		return medicationCategory;
	}
	public void setMedicationCategory(String medicationCategory) {
		this.medicationCategory = medicationCategory;
	}
	
	
}
