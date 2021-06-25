package com.dental.services;

import java.time.LocalDateTime;
import java.util.List;

import com.dental.entities.Appointment;
import com.dental.repositories.AppointmentRepository;
import com.dental.repositories.PatientRepository;

public class appointmentService {
	
	AppointmentRepository arep;
	PatientRepository prep;

	public List<Appointment> retrieveAllAppointments(){
		return (List<Appointment>) arep.findAll();
	}
	
	public int addAppointment(Appointment a) {
		arep.save(a);
		return a.getId();
	}
	
	public void deleteAppointment(int Id) {
		arep.deleteById(Id);
	}
	
	public void updateTime(String s, Appointment a) {
		
		if (s.equals("entryTime1")) {
			a.setEntryTime1(LocalDateTime.now());
		}
		else if (s.equals("entryTime2")) {
			a.setEntryTime2(LocalDateTime.now());
		}
		
		else a.setExitTime(LocalDateTime.now());
		
	}
	
	public Appointment retrieveAppointmentByPatient(int Id){
		
		List<Appointment> list = retrieveAllAppointments();
		return list.stream().filter(a -> a.getPatient().getId() == Id).findFirst().orElse(null);
	}
	

	
}
