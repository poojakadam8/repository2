package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getPatientList();

	Patient updatePatient(long patientId, Patient patient);

	Patient getPatientById(long patientId);

	String deletePatient(long patientId);

	Patient getPatientByFirstName(String firstName);

	Patient getPatientByLastName(String lastName);

	Patient getPatientByGender(String gender);



}
