package com.pb.che.entity;

import lombok.Data;

@Data
public class PatientCureDetail extends BaseEntity
{

	
	
	
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
