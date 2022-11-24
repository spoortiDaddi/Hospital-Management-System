package com.java.hospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Admin {
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "a_id")
	private Long a_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "mobile_no")
	private String mobile_no;
	
	@Column(name = "address")
	private String address;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Long getA_id() {
		return a_id;
	}

	public void setA_id(Long a_id) {
		this.a_id = a_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
