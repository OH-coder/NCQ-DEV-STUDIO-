package tn.iit.store.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table
public class Medication implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
	private String name;
	private float price;
	
	@JoinColumn(name="category", referencedColumnName = "id")
	@ManyToOne
	private MedicationCategory category;

	public Medication() { }
	

	public Medication(Integer id) { this.id = id; }


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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public MedicationCategory getCategory() {
		return category;
	}

	public void setCategory(MedicationCategory category) {
		this.category = category;
	}
	
	
    


	}