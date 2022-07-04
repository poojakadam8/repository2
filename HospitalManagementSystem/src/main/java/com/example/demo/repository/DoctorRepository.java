package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

	List<Doctor> findByLastName(String lastName);

	List<Doctor> findByQualification(String qualification);

	List<Doctor> findByGender(String gender);


	List<Doctor> findByFirstName(String firstName);

}
