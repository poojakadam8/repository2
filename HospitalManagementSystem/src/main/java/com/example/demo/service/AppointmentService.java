package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;

public interface AppointmentService {

	Appointment saveAppointment(Appointment appointment);

	List<Appointment> getAppointmentList();

	Appointment updateAppointment(long id, Appointment appointment);

	String deleteAppointment(long id);

	Appointment getAppointmentById(long id);

	List<Appointment> findByDoctor(Doctor doctor);

	



}
