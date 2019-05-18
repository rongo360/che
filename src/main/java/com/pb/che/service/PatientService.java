package com.pb.che.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pb.che.entity.Patient;
import com.pb.che.repository.PatientRepository;
import com.pb.che.utils.ResultObject;

@Service
public class PatientService
{

	@Autowired
	private PatientRepository patientRepository;
	
	
	public ResultObject save(String data){
		ResultObject resultObject=new ResultObject();
		
		Patient patient=JSONObject.parseObject(data, Patient.class);
	
		patientRepository.save(patient);
		
		
		return resultObject;
		
	}
	
}
