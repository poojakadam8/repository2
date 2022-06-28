package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Doctor;
public interface DoctorService {

	List<Doctor> getDoctorList();
	Doctor saveDoctor(Doctor doctor);
	Doctor getDoctorById(long doctorId);
	Doctor updateDoctor(long doctorId, Doctor doctor);
	String deleteDoctor(long doctorId);
	Doctor getDoctorByFirstName(String firstName);
	List<Doctor> getDoctorByLastName(String lastName);
	List<Doctor> getDoctorByQualification(String qualification);
	List<Doctor> getDoctorByGender(String gender);

}
