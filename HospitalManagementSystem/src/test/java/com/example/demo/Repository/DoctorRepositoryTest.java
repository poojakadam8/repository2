package com.example.demo.Repository;

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
		Doctor doctor=doctorRepository.save(new Doctor(5,"123","Avinash","Pawar"));
		Assertions.assertThat(doctor.getId()).isGreaterThan(0);
	}
	
	@Test 
	public void getDoctorTest() {
		
		Doctor doctor=doctorRepository.findById(2L).get();
		Assertions.assertThat(doctor.getId()).isEqualTo(2L);
	}
}
