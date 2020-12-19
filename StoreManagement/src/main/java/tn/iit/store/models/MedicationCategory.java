package tn.iit.store.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class MedicationCategory implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(min=1, max=100)
	private String name;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private List<Medication> medications=new ArrayList<>();
	public MedicationCategory() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Medication> getMedications() {
		return medications;
	}
	public void setMedications(List <Medication> medications) {
		this.medications = medications;
	}

	
}
