package com.dental.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dental.entities.Patient;

@Service
public interface IPatientService{
	
	public List<Patient> retrieveAllPAtients();
	public int addPatient(Patient p);
	void deletePatient(int Id);
	public int updatePatient(Patient P);
	public Optional<Patient> retrievePatient(int Id);
	

}
