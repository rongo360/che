package com.pb.che.entity;

import java.util.Date;



import lombok.Data;


@Data
public class Patient extends BaseEntity
{

	private String idCard;// 身份证

	private String adderss;

	private Date onsetTime;// 发病时间

	private String reachType;// 到达方式

	private String reachTime;// 到达时间
	
	

}
