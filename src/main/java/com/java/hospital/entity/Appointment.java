package com.java.hospital.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Appointment {
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "p_id")
	private Long p_id;
	
	@Column(name = "specialization")
	private String specialization;
	
	@Column(name = "d_name")
	private String d_name;
	
	@Column(name = "consultant_Fee")
	private int consultant_Fee;
	
	@Column(name = "date")
	private Date date ;
	
	@Column(name = "time")
	private Time time;
	
	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public int getConsultant_Fee() {
		return consultant_Fee;
	}

	public void setConsultant_Fee(int consultant_Fee) {
		this.consultant_Fee = consultant_Fee;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	

}
