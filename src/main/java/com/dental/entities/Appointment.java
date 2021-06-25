package com.dental.entities;

import java.io.Serializable;
import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name ="Appointments")
public class Appointment implements Serializable{

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column (name = "Id")
	private int id;


	
	@Temporal (TemporalType.DATE)
	private LocalDateTime appointmentDate;
	
	@Temporal (TemporalType.DATE)
	private LocalDateTime scheduleDate;
	
	@Temporal (TemporalType.DATE)
	private LocalDateTime entryTime1;
	
	@Temporal (TemporalType.DATE)
	private LocalDateTime entryTime2;
	
	@Temporal (TemporalType.DATE)
	private LocalDateTime exitTime;
	
	@ManyToOne
	Patient patient;
	
	@ManyToOne
	private act act;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", scheduleDate=" + scheduleDate
				+ ", entryTime1=" + entryTime1 + ", entryTime2=" + entryTime2 + ", exitTime=" + exitTime + ", patient="
				+ patient + ", act=" + act + "]";
	}

	public Appointment(LocalDateTime appointmentDate, LocalDateTime entryTime1, LocalDateTime entryTime2,
			LocalDateTime exitTime, Patient patient, com.dental.entities.act act) {
		super();
		this.appointmentDate = appointmentDate;
		this.scheduleDate = LocalDateTime.now();
		this.entryTime1 = entryTime1;
		this.entryTime2 = entryTime2;
		this.exitTime = exitTime;
		this.patient = patient;
		this.act = act;
	}

	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public LocalDateTime getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(LocalDateTime scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public LocalDateTime getEntryTime1() {
		return entryTime1;
	}

	public void setEntryTime1(LocalDateTime entryTime1) {
		this.entryTime1 = entryTime1;
	}

	public LocalDateTime getEntryTime2() {
		return entryTime2;
	}

	public void setEntryTime2(LocalDateTime entryTime2) {
		this.entryTime2 = entryTime2;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public act getAct() {
		return act;
	}

	public void setAct(act act) {
		this.act = act;
	}





	
	
	
	
	
	
}
