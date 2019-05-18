package com.pb.che.entity;

import java.util.Date;



import lombok.Data;


@Data
public class Patient extends BaseEntity
{

	private String idcard;// 身份证

	private String adderss;

	private Date onsetTime;// 发病时间

	private String reachtype;// 到达方式

	private String reachtime;// 到达时间
	
	

}
