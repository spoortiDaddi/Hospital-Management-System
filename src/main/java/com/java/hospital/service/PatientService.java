package com.java.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.hospital.entity.Patient;
import com.java.hospital.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	public void savePatientDetails(Patient patient) {
		patientRepository.save(patient);
	}
	
	//public void updatePatientDetails()
}
