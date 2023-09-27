package com.student.rest.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author shubham.tiwari18
 *
 */
/**
 * @author shubham.tiwari18
 *
 */
@Entity

public class student {
	
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	
	
	private Long id;
	
	private String name;
	private String age;
	@Column(name="mobile_number")
	private String mobileNumber;
	private String address;
	
	@Column(name="roll_no")
	private String rollNo;
	
	@CreationTimestamp
	@Column(name="created_date")
	private LocalDateTime createdDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", address="
				+ address + ", rollNo=" + rollNo + ", createdDate=" + createdDate + "]";
	}
	
	
	
	
	

}
