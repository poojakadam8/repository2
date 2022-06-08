package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String address;
	private String cintactno;
	private Date date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCintactno() {
		return cintactno;
	}
	public void setCintactno(String cintactno) {
		this.cintactno = cintactno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Patient(long id, String firstName, String lastName, int age, String gender, String address, String cintactno,
			Date date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.cintactno = cintactno;
		this.date = date;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + ", cintactno=" + cintactno + ", date=" + date + "]";
	}
	
	
}
