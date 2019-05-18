package com.pb.che.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.che.constant.RoleTypeConstant;
import com.pb.che.context.CurrentUserContext;
import com.pb.che.context.UserDomain;
import com.pb.che.entity.Hospital;
import com.pb.che.repository.HospitalRepository;
import com.pb.che.utils.ResultObject;

@Service
public class HospitalService
{
 
	@Autowired
	private  HospitalRepository hospitalRepository;
	
	public ResultObject get(Integer id){
		ResultObject resultObject=new ResultObject();
		UserDomain userDomain=CurrentUserContext.get();
		if(!userDomain.getRoletype().equals(RoleTypeConstant.ROLETYPE_SYSTEM)){
			 resultObject.setSuccess(false);
			 resultObject.setMessage("");
			 return resultObject;
		}
		
		Hospital hospital=hospitalRepository.getOne(id);
		resultObject.setData(hospital);
		
		
		return resultObject;
		
	}
	
}
