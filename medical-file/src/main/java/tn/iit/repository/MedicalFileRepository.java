package tn.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iit.store.models.Medication;

public class MedicalFileRepository extends JpaRepository<Medication, Integer> {



}
