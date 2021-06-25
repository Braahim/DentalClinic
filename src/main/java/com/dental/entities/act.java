package com.dental.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table( name ="Acts")
public class act  implements Serializable{
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column (name = "Id")
	private int id;

	@Column()
	private String Title;
	
	@Column()
	private Long fee;
	
	@Column()
	private Long consumption;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "act")
	private Set<Appointment> appointments;
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Long getFee() {
		return fee;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}

	public Long getConsumption() {
		return consumption;
	}

	public void setConsumption(Long consumption) {
		this.consumption = consumption;
	}

	public act(String title, Long fee, Long consumption) {
		super();
		Title = title;
		this.fee = fee;
		this.consumption = consumption;
	}

	public act() {
		super();
	}

	@Override
	public String toString() {
		return "act [id=" + id + ", Title=" + Title + ", fee=" + fee + ", consumption=" + consumption + "]";
	}

	
}
