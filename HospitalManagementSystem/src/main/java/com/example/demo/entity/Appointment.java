package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
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
	private String appointmentNo;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private String disease;
	@Column(nullable=false)
	@NotNull(message="this field is manditory")
	private Date date;
	
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

	public String getAppointmentNo() {
		return appointmentNo;
	}

	public void setAppointmentNo(String appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	
	

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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



	public Appointment(long id, @NotNull(message = "this field is manditory") String appointmentNo,
			@NotNull(message = "this field is manditory") String disease) {
		super();
		this.id = id;
		this.appointmentNo = appointmentNo;
		this.disease = disease;
	}

	public Appointment(long id, String appointmentNo, String disease, Date date, Patient patient, Doctor doctor) {
		super();
		this.id = id;
		this.appointmentNo = appointmentNo;
		this.disease = disease;
		this.date = date;
		this.patient = patient;
		this.doctor = doctor;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentNo=" + appointmentNo + ", disease=" + disease + ", date=" + date
				+ ", patient=" + patient + ", doctor=" + doctor + "]";
	}

	
	
	
	
	
	
}

