package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties("hibernateLazyInitializer")

public class Doctor implements Serializable
 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String doctorId;
	private String firstName;
	private String lastName;
	private String address;
	private long  contactNo;
	private String gender;
	private String age;
	private String qualification;
	private String yearOfExperience;
	private long salary;
	private String userName;
	private String password;
	
	@OneToMany(mappedBy="doctor", cascade=CascadeType.PERSIST)
	@JsonIgnoreProperties({"doctor","userName","password"})
	private List<Patient> patient;
	
	@OneToMany(mappedBy="doctor",cascade=CascadeType.PERSIST)
	@JsonIgnoreProperties("doctor")
	private List<Appointment> appointment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Doctor(int id, String doctorId, String firstName, String lastName, String address, long contactNo,
			String gender, String age, String qualification, String yearOfExperience, long salary, String userName,
			String password, List<Patient> patient, List<Appointment> appointment) {
		super();
		this.id = id;
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNo = contactNo;
		this.gender = gender;
		this.age = age;
		this.qualification = qualification;
		this.yearOfExperience = yearOfExperience;
		this.salary = salary;
		this.userName = userName;
		this.password = password;
		this.patient = patient;
		this.appointment = appointment;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", contactNo=" + contactNo + ", gender=" + gender + ", age=" + age
				+ ", qualification=" + qualification + ", yearOfExperience=" + yearOfExperience + ", salary=" + salary
				+ ", userName=" + userName + ", password=" + password + ", patient=" + patient + ", appointment="
				+ appointment + "]";
	}
	
	
	
	
	
}
