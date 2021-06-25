package com.dental.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dental.entities.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
	
	

}
