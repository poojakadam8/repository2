package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties("hibernateLazyInitializer")

public class Appointment implements Serializable
{

	@Id
	@GeneratedValue(generator="seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name= "seq", initialValue=101)
	private long id;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private String firstName;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private String lastName;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private String doctorName;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private String deceased;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private Date date;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private Time time;
	
	@OneToOne(mappedBy="appointment",cascade=CascadeType.PERSIST)
	@JoinColumn(name="patientId")
	@JsonIgnoreProperties({"appointment","userName","password"})
	private Patient patient;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties("appointment")
	private Doctor doctor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDeceased() {
		return deceased;
	}

	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Appointment(long id, @NotNull(message = "this field is manditory") String firstName,
			@NotNull(message = "this field is manditory") String lastName,
			@NotNull(message = "this field is manditory") String doctorName,
			@NotNull(message = "this field is manditory") String deceased,
			@NotNull(message = "this field is manditory") Date date,
			@NotNull(message = "this field is manditory") Time time, Patient patient, Doctor doctor) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.doctorName = doctorName;
		this.deceased = deceased;
		this.date = date;
		this.time = time;
		this.patient = patient;
		this.doctor = doctor;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", doctorName="
				+ doctorName + ", deceased=" + deceased + ", date=" + date + ", time=" + time + ", patient=" + patient
				+ ", doctor=" + doctor + "]";
	}

	public Appointment(long id, @NotNull(message = "this field is manditory") String firstName,
			@NotNull(message = "this field is manditory") String lastName,
			@NotNull(message = "this field is manditory") String deceased) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deceased = deceased;
	}


	
	
	
	
	
}

