package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private long  contactNo;
	private String qualification;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Doctor(int id, String firstName, String lastName, String address, long contactNo, String qualification,
			String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNo = contactNo;
		this.qualification = qualification;
		this.gender = gender;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", contactNo=" + contactNo + ", qualification=" + qualification + ", gender=" + gender + "]";
	}
	
	
}
