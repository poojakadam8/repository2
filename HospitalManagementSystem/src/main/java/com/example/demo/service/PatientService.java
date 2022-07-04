package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getPatientList();

	Patient updatePatient(long id, Patient patient);

	Patient getPatientById(long id);

	String deletePatient(long id);

	Patient getPatientByFirstName(String firstName);

	Patient getPatientByLastName(String lastName);

	Patient getPatientByGender(String gender);



}
