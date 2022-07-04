package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Doctor;
public interface DoctorService {

	List<Doctor> getDoctorList();
	Doctor saveDoctor(Doctor doctor);
	Doctor getDoctorById(long id);
	Doctor updateDoctor(long id, Doctor doctor);
	String deleteDoctor(long id);
	List<Doctor> getDoctorByLastName(String lastName);
	List<Doctor> getDoctorByQualification(String qualification);
	List<Doctor> getDoctorByGender(String gender);
	List<Doctor> getDoctorByFirstName(String firstName);

}
