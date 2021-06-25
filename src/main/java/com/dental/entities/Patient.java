package com.dental.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;





@Entity
@Table( name ="Patients")
public class Patient implements Serializable{
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column (name = "Id")
	private int id;

	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Temporal (TemporalType.DATE)
	private Date birthdate;
	
	@Column(name="tel2")
	private String tel2;
	
	@Column(name="tel1")
	private String tel1;
	
	@Column(name="date_ajout")
	private LocalDate date_ajout;
	
	@Column(name="generalState")
	private String generalState;
	
	@Column(name="currentMedication")
	private String currentMedication;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="patient")
	private Set<Appointment> appointments;
	


	

	public Patient(int id, String name, String surname, Date birthdate, String tel2, String tel1,
			String generalState, String currentMedication, Set<Appointment> appointments) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.tel2 = tel2;
		this.tel1 = tel1;
		this.date_ajout = java.time.LocalDate.now();
		this.generalState = generalState;
		this.currentMedication = currentMedication;
		this.appointments = appointments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getGeneralState() {
		return generalState;
	}

	public void setGeneralState(String generalState) {
		this.generalState = generalState;
	}

	public String getCurrentMedication() {
		return currentMedication;
	}

	public void setCurrentMedication(String currentMedication) {
		this.currentMedication = currentMedication;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", surname=" + surname + ", birthdate=" + birthdate + ", tel2="
				+ tel2 + ", tel1=" + tel1 + ", generalState=" + generalState + ", currentMedication="
				+ currentMedication + "]";
	}
	
	
	
	
}
