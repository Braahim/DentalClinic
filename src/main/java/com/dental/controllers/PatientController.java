package com.dental.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dental.entities.Patient;
import com.dental.services.patientService;

@Controller
public class PatientController {

	@Autowired 
	patientService ps;
	
	@PostMapping("/addPatient")
	@ResponseBody
	public int addPatient(@RequestBody Patient p) {
		ps.addPatient(p);
		return p.getId();
	}
	
	
	@PostMapping("/updatePatient")
	@ResponseBody
	public int updatePatient(@RequestBody Patient p) {
		ps.updatePatient(p);
		return p.getId();
	}
	
	@PostMapping("/deletePatient")
	@ResponseBody
	public int deletePatient(@RequestParam int id) {
		ps.deletePatient(id);
		return id;
	}
	
	@PostMapping("/retrievePatient")
	@ResponseBody
	public Optional<Patient> retrievePatient(@RequestParam int id) {
		return ps.retrievePatient(id);
	}
	
	@PostMapping("/retrieve_AllPatient")
	@ResponseBody
	public List<Patient> retrieveAllPatient() {
		return ps.retrieveAllPAtients();
	}
}















