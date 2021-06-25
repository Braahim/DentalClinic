package com.dental.services;

import java.util.List;
import java.util.Optional;

import com.dental.entities.Appointment;
import com.dental.entities.Patient;

public interface IAppointmentService {
	
	public List<Appointment> retrieveAllAppointments();
	public int addAppointment(Appointment a);
	public void deleteAppointment(int Id);
	public void updateTime(String s, Appointment a);
	public Appointment retrieveAppointmentByPatient(int Id);
	
}
