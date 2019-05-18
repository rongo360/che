package com.pb.che.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.che.annotation.Authority;
import com.pb.che.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController
{

	@Autowired
	private  HospitalService hospitalService;
	
	
	
	
	
	
	
}
