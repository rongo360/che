package com.pb.che.entity;

import lombok.Data;

@Data
public class PatientCureDetail extends BaseEntity
{

	
	private  Long patientId;//病人
	
	private  String idCard;//身份证
	
	private  String roleType;// 拥有这个角色的人才能操作这条数据
	
	private  String  content;
	
	
	
	
}
