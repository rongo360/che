package com.pb.che.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_patientcuredetail")
public class PatientCureDetail extends BaseEntity
{


	private static final long serialVersionUID = 1L;

	private  String idcard;//身份证
	
	private  String roletype;// 拥有这个角色的人才能操作这条数据
	
	private  String content;
	
	private  int pcid;//病情的Id

	public String getIdcard()
	{
		return idcard;
	}

	public void setIdcard(String idcard)
	{
		this.idcard = idcard;
	}

	public String getRoletype()
	{
		return roletype;
	}

	public void setRoletype(String roletype)
	{
		this.roletype = roletype;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public int getPcid()
	{
		return pcid;
	}

	public void setPcid(int pcid)
	{
		this.pcid = pcid;
	}
	
	
	
}
