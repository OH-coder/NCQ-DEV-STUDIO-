package tn.iit.dto;

import jdk.jfr.DataAmount;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class MedCategoryDTO {
    @NotNull
    @Size(min = 1, max = 100)
    private String name;
    private List<MedicationDTO> medicationDTOS=new ArrayList<>();

    public MedCategoryDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
