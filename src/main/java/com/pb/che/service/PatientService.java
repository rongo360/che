package com.pb.che.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.che.repository.PatientRepository;

@Service
public class PatientService
{

	@Autowired
	private PatientRepository patientRepository;
	
}
