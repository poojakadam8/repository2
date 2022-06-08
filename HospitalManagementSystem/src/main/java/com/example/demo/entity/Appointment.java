package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment {

	@Id
	private long id;
	private String appointmentId;
}
