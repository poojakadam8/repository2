package com.example.demo.Repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AppointmentRepository;

@DataJpaTest
@AutoConfigureTestDatabase( replace = Replace.NONE)
public class AppointmentRepositoryTest {

	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Test
	public void saveAppointmentTest() {
		Appointment app=appointmentRepository.save(new Appointment(1053,"divya","patil","fever"));
		Assertions.assertThat(app.getId()).isGreaterThan(0);
	}
	
	@Test
	public void getAppointmentTest() {
		Appointment app=appointmentRepository.findById(1053L).get();
		Assertions.assertThat(app.getId()).isEqualTo(1053L);
		
	}
	@Test
	public void getAppointmentListTest() {
		List <Appointment> app=appointmentRepository.findAll();
		Assertions.assertThat(app.size()).isGreaterThan(0);
	}
	
	@Test
	public void updateAppointmentTest() {
		Appointment app=appointmentRepository.findById(1053L).get();
		app.setDeceased("");
		Appointment updated=appointmentRepository.save(app);
		Assertions.assertThat(updated.getDeceased()).isEqualTo("");
	}
	
	@Test
	public void deleteAppointmentTest() {
		
		Appointment app=appointmentRepository.findById(2L).get();
		appointmentRepository.delete(app);
	}
}
