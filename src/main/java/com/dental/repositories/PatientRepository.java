package com.dental.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dental.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
