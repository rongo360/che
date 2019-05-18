package com.pb.che.service;



import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pb.che.constant.RoleTypeConstant;
import com.pb.che.context.CurrentUserContext;
import com.pb.che.context.UserDomain;
import com.pb.che.entity.Patient;
import com.pb.che.entity.PatientCondition;
import com.pb.che.entity.PatientCureDetail;
import com.pb.che.entity.User;
import com.pb.che.repository.PatientConditionRepository;
import com.pb.che.repository.PatientCureDetailRepository;
import com.pb.che.repository.PatientRepository;
import com.pb.che.utils.ResultObject;



@Service
public class PatientService
{

	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private  PatientCureDetailRepository patientCureDetailRepository;
	@Autowired
	private  PatientConditionRepository patientConditionRepository;
	
	@Transactional
	public ResultObject save(String data){
		ResultObject resultObject=new ResultObject();
		
		Patient patient=JSONObject.parseObject(data, Patient.class);
	
        PatientCondition condition=new PatientCondition();
		
		patientConditionRepository.save(condition);//病情
		
		int  pcid=condition.getId();
		
		
		patientRepository.save(patient);//病人
		
		
		
		List<PatientCureDetail> cureDetails=new ArrayList<PatientCureDetail>();
		
		for (PatientCureDetail cureDetail : cureDetails)
		{
			cureDetail.setPcid(pcid);
		}
		
		
		patientCureDetailRepository.saveAll(cureDetails);
		return resultObject;
		
	}
	
	
	public ResultObject getcue(String pcid){
		
		ResultObject resultObject=new ResultObject();
		
		UserDomain userDomain= CurrentUserContext.get();
		
		List<PatientCureDetail> patientCureDetails=patientCureDetailRepository.
				getListsByPcid(pcid, userDomain.getHoscode());
		
		resultObject.setData(patientCureDetails);
		
		
		
		return resultObject;
	}
	
	
	public ResultObject update(String data){
		ResultObject resultObject=new ResultObject();
		
		UserDomain userDomain=CurrentUserContext.get();
		 
		String roleType=userDomain.getRoletype();
		
		if(RoleTypeConstant.ROLETYPE_FIRSTAD.equals(roleType)){//急救填报员
			
		}
		
		if(RoleTypeConstant.ROLETYPE_CHESTPAIN.equals(roleType)){// 胸痛填报员
			
		}
		
		if (RoleTypeConstant.ROLETYPE_CHESTPAIN.equals(roleType))
		{
			
		}
		
		
		
		return resultObject;
		
		
	}
	
	
}
