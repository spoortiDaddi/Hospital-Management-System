package com.java.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.hospital.constants.AppConstant;
import com.java.hospital.service.AdminService;

@RestController
@RequestMapping(AppConstant.AdminController)
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
}
