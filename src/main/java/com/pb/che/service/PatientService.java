package com.pb.che.service;



import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pb.che.entity.Patient;
import com.pb.che.entity.PatientCondition;
import com.pb.che.entity.PatientCureDetail;
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
		patient.setPcid(pcid);
		
		patientRepository.save(patient);//病人
		
		
		
		List<PatientCureDetail> cureDetails=new ArrayList<PatientCureDetail>();
		
		for (PatientCureDetail cureDetail : cureDetails)
		{
			cureDetail.setPcid(pcid);
		}
		
		
		patientCureDetailRepository.saveAll(cureDetails);
		return resultObject;
		
	}
	
}
