package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties("hibernateLazyInitializer")

public class Doctor implements Serializable
 {

	@Id
	@GeneratedValue(generator="seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name= "seq", initialValue = 101)

	private long doctorId;
	@Column(nullable=false)
	@NotNull
	@NotBlank(message ="first name is manditory")
	private String firstName;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String lastName;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String address;
	@Column(nullable=false)
	private long  contactNo;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String gender;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String age;
	@Column(nullable=false)
	private LocalDate joiningDate;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String qualification;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String yearOfExperience;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String userName;
	@Column(nullable=false)
	@NotBlank(message="last name is manditory")
	private String password;
	
	@OneToMany(mappedBy="doctor", cascade=CascadeType.PERSIST)
	@JsonIgnoreProperties({"doctor","userName","password"})
	private List<Patient> patient;
	
	@OneToMany(mappedBy="doctor",cascade=CascadeType.PERSIST)
	@JsonIgnoreProperties("doctor")
	private List<Appointment> appointment;
	
	@PrePersist
	public void addDate() {
		this.joiningDate = LocalDate.now();
	}

	
	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
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



	
	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
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


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}




	
	



	public Doctor(long doctorId, @NotNull @NotBlank(message = "first name is manditory") String firstName,
			@NotBlank(message = "last name is manditory") String lastName,
			@NotBlank(message = "last name is manditory") String address, long contactNo,
			@NotBlank(message = "last name is manditory") String gender,
			@NotBlank(message = "last name is manditory") String age, LocalDate joiningDate,
			@NotBlank(message = "last name is manditory") String qualification,
			@NotBlank(message = "last name is manditory") String yearOfExperience,
			@NotBlank(message = "last name is manditory") String userName,
			@NotBlank(message = "last name is manditory") String password, List<Patient> patient,
			List<Appointment> appointment) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNo = contactNo;
		this.gender = gender;
		this.age = age;
		this.joiningDate = joiningDate;
		this.qualification = qualification;
		this.yearOfExperience = yearOfExperience;
		this.userName = userName;
		this.password = password;
		this.patient = patient;
		this.appointment = appointment;
	}


	

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", contactNo=" + contactNo + ", gender=" + gender + ", age=" + age + ", joiningDate="
				+ joiningDate + ", qualification=" + qualification + ", yearOfExperience=" + yearOfExperience
				+ ", userName=" + userName + ", password=" + password + ", patient=" + patient + ", appointment="
				+ appointment + "]";
	}


	public Doctor(long doctorId, @NotNull @NotBlank(message = "first name is manditory") String firstName,
			@NotBlank(message = "last name is manditory") String lastName) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	
	
	
	
	
}
