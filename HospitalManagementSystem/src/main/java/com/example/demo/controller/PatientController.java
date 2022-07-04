package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	@PostMapping
	public ResponseEntity<Patient> savePatient(@Valid @RequestBody Patient patient)
	{
		return new ResponseEntity<Patient>(patientService.savePatient(patient),HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Patient> getPatientList(){
		return patientService.getPatientList();
	}
	
	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable("id")long id) {
		return patientService.getPatientById(id);
		
	}
	
	@PutMapping("/{id}")
	public Patient updatePatient(@Valid @PathVariable("id") long id, @RequestBody Patient patient) {
	
		return patientService.updatePatient(id,patient);
	}
	
	@DeleteMapping("/{id}")
	public String deletePatient(@PathVariable("id") long id) {
		return patientService.deletePatient(id);
		
	}
	
	@GetMapping("/byfname/{firstName}")
	public List<Patient> getPatientByFirstName(@PathVariable("firstName") String firstName){
		return patientService.getPatientByFirstName(firstName);
		
		
	}
	
	@GetMapping("/bylname/{lastName}")
	public Patient getPatientByLastName(@PathVariable("lastName") String lastName){
		return patientService.getPatientByLastName(lastName);
		
	}
	@GetMapping("/bygender/{gender}")
	public Patient getPatientByGender(@PathVariable("gender") String gender){
		return patientService.getPatientByGender(gender);
		
	}
	
	/**@GetMapping("/getbyfullname/{firstName}/{lastName}")
	public List<Patient> getByFullName(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName)
	{
		return patientService.getByFullName(firstName,lastName);
		
	}**/
	
	@GetMapping("/getbyage/{age}")
	public List<Patient> getByageGreaterThan(@PathVariable("age") String age)
	{
		return patientService.getByAgeGreaterThan(age);
		
	}
	
}
