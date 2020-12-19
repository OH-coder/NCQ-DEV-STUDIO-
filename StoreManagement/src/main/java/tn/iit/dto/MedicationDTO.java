package tn.iit.dto;

import tn.iit.store.models.MedicationCategory;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class MedicationDTO {
	

	@NotNull
	@Size(min = 1, max = 100)
	private String name;
	@NotNull
	@Positive(message = "value must be positive or zero")
	private float price;
	private MedCategoryDTO medCategoryDTO;
public MedicationDTO(){

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public MedCategoryDTO getMedCategoryDTO() {
		return medCategoryDTO;
	}

	public void setMedCategoryDTO(MedCategoryDTO medCategoryDTO) {
		this.medCategoryDTO = medCategoryDTO;
	}
}
