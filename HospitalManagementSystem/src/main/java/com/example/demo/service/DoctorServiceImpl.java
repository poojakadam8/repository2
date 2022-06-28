package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.exception.GivenIdNotFoundException;
import com.example.demo.exception.NoRecordFoundException;
import com.example.demo.exception.NoSuchDataFoundException;
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
		return doctorRepository.save(doctor);
	}


	@Override
	public List<Doctor> getDoctorList() {
		// TODO Auto-generated method stub
		List<Doctor> doctor= doctorRepository.findAll();
		if(doctor.isEmpty())
			throw new NoRecordFoundException();
		else
			return doctor;
	}

	@Override
	public Doctor getDoctorById(long doctorId) {
		// TODO Auto-generated method stub
		
		Optional<Doctor> doctor= doctorRepository.findById(doctorId);
		
		if(doctor.isPresent())
			return doctor.get();
		else
			throw new GivenIdNotFoundException();
	}

	@Override
	public Doctor updateDoctor(long doctorId, Doctor doctor) {
		// TODO Auto-generated method 
		Doctor dr =doctorRepository.findById(doctorId).orElseThrow(()-> new GivenIdNotFoundException());
		
		dr.setFirstName(doctor.getFirstName());
		dr.setLastName(doctor.getLastName());
		dr.setAddress(doctor.getAddress());
		dr.setContactNo(doctor.getContactNo());
		dr.setQualification(doctor.getQualification());
		dr.setGender(doctor.getGender());
		dr.setUserName(doctor.getUserName());
		dr.setPassword(doctor.getPassword());
		dr.setYearOfExperience(doctor.getYearOfExperience());
		doctorRepository.save(dr);
		return dr;
	}

	@Override
	public String deleteDoctor(long doctorId) {
		// TODO Auto-generated method stub
	Doctor doctor=doctorRepository.findById(doctorId).orElseThrow(()-> new GivenIdNotFoundException());
	doctorRepository.deleteById(doctorId);;	
	return "Doctor Record Deleted Successfully";
	}

	@Override
	public Doctor getDoctorByFirstName(String firstName) {
		// TODO Auto-generated method stub
		Optional <Doctor> doctor=doctorRepository.findByFirstName(firstName);

		if(doctor.isPresent())
		{
			return doctor.get();
		}
		else
			throw new NoSuchDataFoundException();
	}

	@Override
	public List<Doctor> getDoctorByLastName(String lastName) {
		// TODO Auto-generated method stub
		List<Doctor> doctor=doctorRepository.findByLastName(lastName);
		
		if(doctor.isEmpty()) {
			throw new NoSuchDataFoundException();
		}
		else {
		return doctor;
		}
	}

	@Override
	public List<Doctor> getDoctorByQualification(String qualification) {
		// TODO Auto-generated method stub
		List<Doctor> doctor=doctorRepository.findByQualification(qualification);
		
		if(doctor.isEmpty()) {
			throw new NoSuchDataFoundException();
		}
		else {
		return doctor;
		}
	}

	@Override
	public List<Doctor> getDoctorByGender(String gender) {
		// TODO Auto-generated method stub
		List<Doctor> doctor=doctorRepository.findByGender(gender);
		if(doctor.isEmpty()) {
			throw new NoSuchDataFoundException();
		}
		else {
		return doctor;
		}
	}

	
}
