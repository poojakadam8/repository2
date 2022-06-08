package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public Appointment saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> getAppointmentList() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment updateAppointment(long id, Appointment appointment) {
		// TODO Auto-generated method stub
		
	 Appointment app=appointmentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Appointment","id",id));
	 
	 appointmentRepository.save(app);
		return app;
	}

	@Override
	public String deleteAppointment(long id) {
		// TODO Auto-generated method stub
		
		Appointment appointment=appointmentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Appointment","id",id));
		
		appointmentRepository.deleteById(id);
		return "Appointment Record Deleted Successfully";
	}
	
	
}
