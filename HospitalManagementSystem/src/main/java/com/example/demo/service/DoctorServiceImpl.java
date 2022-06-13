package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{

	DoctorRepository doctorRepository;
	
	
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}
	
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}


	@Override
	public List<Doctor> getDoctorList() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(long id) {
		// TODO Auto-generated method stub
		
		Optional<Doctor> doctor= doctorRepository.findById(id);
		
		if(doctor.isPresent())
			return doctor.get();
		else
			throw new ResourceNotFoundException("Doctor", "Id", id);
	}

	@Override
	public Doctor updateDoctor(long id, Doctor doctor) {
		// TODO Auto-generated method 
		Doctor dr =doctorRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Doctor","Id",id));
		
		dr.setFirstName(doctor.getFirstName());
		dr.setLastName(doctor.getLastName());
		dr.setAddress(doctor.getAddress());
		dr.setContactNo(doctor.getContactNo());
		dr.setQualification(doctor.getQualification());
		dr.setGender(doctor.getGender());
		dr.setUserName(doctor.getUserName());
		dr.setPassword(doctor.getPassword());
		dr.setYearOfExperience(doctor.getYearOfExperience());
		dr.setSalary(doctor.getSalary());
		
		doctorRepository.save(dr);
		return dr;
	}

	@Override
	public String deleteDoctor(long id) {
		// TODO Auto-generated method stub
	Doctor doctor=doctorRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Doctor","Id",id));
	doctorRepository.deleteById(id);;	
	return "Doctor Record Deleted Successfully";
	}

	
}
