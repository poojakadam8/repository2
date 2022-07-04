package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class DoctorRepositoryTest {

	
	@Autowired
	 private DoctorRepository doctorRepository;
	
	
	@Test
	public void saveDoctorTest() {
		Doctor doctor=doctorRepository.save(new Doctor(1003,"Avinash","Pawar"));
		Assertions.assertThat(doctor.getId()).isGreaterThan(0);
	}
	
	@Test 
	public void getDoctorTest() {
		
		Doctor doctor=doctorRepository.findById(1002L).get();
		Assertions.assertThat(doctor.getId()).isEqualTo(1002L);
	}
	
	@Test
	public void getDoctorListTest() {
		
		List<Doctor> doctor=doctorRepository.findAll();
		Assertions.assertThat(doctor.size()).isGreaterThan(0);
		
	}
	
	@Test
	public void updateDoctorTest() {
		Doctor doctor=doctorRepository.findById(1002L).get();
       doctor.setFirstName("Sanjay");
		Doctor updated=doctorRepository.save(doctor);
		
		Assertions.assertThat(updated.getFirstName()).isEqualTo("Sanjay");
	}
	
	@Test
	public void deleteDoctorTest() {
		Doctor doctor=doctorRepository.findById(2L).get();
		doctorRepository.delete(doctor);
		Doctor doctor2=null;
	  // Optional <Doctor> doctor1= doctorRepository.findByFirstName("pooja");
       // if(doctor1.isPresent()) {
        //	doctor2=doctor1.get();
        //}
        //Assertions.assertThat(doctor2).isNull();
	}
}
