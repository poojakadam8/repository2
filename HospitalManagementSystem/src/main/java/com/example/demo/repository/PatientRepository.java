package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {

	Optional<Patient> findByFirstName(String firstName);

	Optional<Patient> findByLastName(String lastName);

	Optional<Patient> findByGender(String gender);

}
