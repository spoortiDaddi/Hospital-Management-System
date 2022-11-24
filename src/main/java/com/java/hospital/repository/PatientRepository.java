package com.java.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.hospital.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
