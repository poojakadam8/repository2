package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

	@Query("select a from Appointment a where doctor=:doctor")
	List<Appointment> findByDoctor(@Param("doctor")Doctor doctor);

}
