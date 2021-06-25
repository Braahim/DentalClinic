package com.dental.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dental.entities.Patient;
import com.dental.repositories.PatientRepository;

@Service
public class patientService implements IPatientService {

	@Autowired
	PatientRepository prep;
	
	
	@Override
	public List<Patient> retrieveAllPAtients(){
		return (List<Patient>) prep.findAll();
	}
	
	@Override
	public int addPatient(Patient p) {
		prep.save(p);
		return p.getId();
		}
	
	
	
	@Override
	public void deletePatient(int Id) {
		prep.deleteById(Id);
		
		
	}
	
	@Override
	public Optional<Patient> retrievePatient(int Id) {
		
		return prep.findById(Id);
	}

	@Override
	public int updatePatient(Patient P) {
		prep.save(P);
		return P.getId();
	}
	
	
	
}
