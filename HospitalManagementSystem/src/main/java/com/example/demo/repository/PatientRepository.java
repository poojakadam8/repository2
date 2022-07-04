package com.example.demo.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {


	Optional<Patient> findByLastName(String lastName);

	Optional<Patient> findByGender(String gender);


	List<Patient> findByFirstName(String firstName);

	@Query("select p from Patient p where p.age > 18")
	List<Patient> getByAgeGreaterThan(String age);
	
   /** @Query("select p from Patient p where p.firstName=:fName, p.lastName=:lName")
	List<Patient> getByFullName(@Param("fName")String firstName, @Param("lName")String lastName);**/

}
