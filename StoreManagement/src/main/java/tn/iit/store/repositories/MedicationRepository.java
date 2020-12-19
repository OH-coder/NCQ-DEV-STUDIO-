package tn.iit.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iit.store.models.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Integer> {

}
