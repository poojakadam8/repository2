package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getPatientList() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	

	@Override
	public Patient updatePatient(long id, Patient patient) {
		// TODO Auto-generated method stub
		
		Patient paitent1=patientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Patient","id",id));
		return null;
		
		
	}

	@Override
	public Patient getPatientById(long id) {
		// TODO Auto-generated method stub
Patient patient=patientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Patient","id",id));
		
		return patient;
		
	}

	@Override
	public String deletePatient(long id) {
		// TODO Auto-generated method stub
		Patient patient=patientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Patient","id",id));
		patientRepository.deleteById(id);
		return "Patient record deleted successfully..";
	}


}
