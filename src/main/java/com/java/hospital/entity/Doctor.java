package com.java.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Doctor {
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "d_id")
	private Long d_id;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "specialization")
	private String specialization;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "mobile_no")
	private int mobile_no;
	
	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "schedule")
	private String schedule;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Long getD_id() {
		return d_id;
	}

	public void setD_id(Long d_id) {
		this.d_id = d_id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	
}
