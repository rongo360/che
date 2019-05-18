package com.pb.che.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pb.che.annotation.Authority;
import com.pb.che.constant.RoleTypeConstant;
import com.pb.che.entity.User;
import com.pb.che.service.PatientService;
import com.pb.che.utils.ResultObject;

@RestController
@RequestMapping("/patient")
public class PatientController
{
	
	@Autowired
	private PatientService patientService;
	
	
	@PostMapping("/save")
    @Authority(roleType={
    		RoleTypeConstant.ROLETYPE_ADMIN})
	public ResultObject save(String data)
	{
		ResultObject result = new ResultObject();
		
		patientService.save(data);
		return result;
	}
	
	
	@PostMapping("/getcue/{pcid}")

	public ResultObject getcue(@PathVariable String pcid){
		
		ResultObject	result=patientService.getcue(pcid);
		return result;
		
	}
	
	@PostMapping("/update")
	public ResultObject update(String data){
		
		ResultObject result = new ResultObject();
		 result=patientService.update(data);
		return result;
		
	}
	

	

}
