package com.java.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.hospital.constants.AppConstant;
import com.java.hospital.entity.Patient;
import com.java.hospital.service.PatientService;


@RestController
@RequestMapping(value = AppConstant.PatientController)
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@PostMapping(value = AppConstant.SavePatientDetails)
	public void savePatientDetails(@RequestBody Patient patient) {
		patientService.savePatientDetails(patient);
	}
}
