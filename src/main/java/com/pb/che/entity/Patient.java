package com.pb.che.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="t_patient")
public class Patient extends BaseEntity
{

	private  String name;
	
	private  int gender;//
	
	private  int age;

	private  String phone;//电话
	
	private String idcard;// 身份证

	private String onsetadderss;//发病地址

	private String adderss;//地址
	
	private Date onsettime;// 发病时间

	private String calltype;// 呼救方式
	
	private Date calltime;// 呼救时间
	
	private String reachtype;// 来院方式
	
	private String reachtime;// 来院时间
	
	private Date startitme;// 住院时间
	
	private Date endtitme;// 出院院时间
	
	private String  docure="1";
	
	private int pcid;//最新的病情
	
	private int  times;//次数

	private int  chief;//组织医生
	
	private String chiefname;//医生名字


	

}
