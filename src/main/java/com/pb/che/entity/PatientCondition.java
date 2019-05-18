package com.pb.che.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_patientcondition")
public class PatientCondition extends BaseEntity
{


	
	
	private String idcard;// 身份证

	private String adderss;//地址

	private Date onsetTime;// 发病时间

	private String reachtype;// 到达方式

	private Date startitme;// 住院时间
	
	private Date endtitme;// 出院院时间
	
	private int pcid;//最新的病情
	
	private int pcdId;//治疗方案；
	
	private  int times;
	

	private int  chief;//组织医生
	
	private String chiefname;//医生名字

	public String getIdcard()
	{
		return idcard;
	}

	public void setIdcard(String idcard)
	{
		this.idcard = idcard;
	}

	public String getAdderss()
	{
		return adderss;
	}

	public void setAdderss(String adderss)
	{
		this.adderss = adderss;
	}

	public Date getOnsetTime()
	{
		return onsetTime;
	}

	public void setOnsetTime(Date onsetTime)
	{
		this.onsetTime = onsetTime;
	}

	public String getReachtype()
	{
		return reachtype;
	}

	public void setReachtype(String reachtype)
	{
		this.reachtype = reachtype;
	}

	public Date getStartitme()
	{
		return startitme;
	}

	public void setStartitme(Date startitme)
	{
		this.startitme = startitme;
	}

	public Date getEndtitme()
	{
		return endtitme;
	}

	public void setEndtitme(Date endtitme)
	{
		this.endtitme = endtitme;
	}

	public int getPcid()
	{
		return pcid;
	}

	public void setPcid(int pcid)
	{
		this.pcid = pcid;
	}

	public int getPcdId()
	{
		return pcdId;
	}

	public void setPcdId(int pcdId)
	{
		this.pcdId = pcdId;
	}

	public int getTimes()
	{
		return times;
	}

	public void setTimes(int times)
	{
		this.times = times;
	}

	public int getChief()
	{
		return chief;
	}

	public void setChief(int chief)
	{
		this.chief = chief;
	}

	public String getChiefname()
	{
		return chiefname;
	}

	public void setChiefname(String chiefname)
	{
		this.chiefname = chiefname;
	}
	
	
	
	
	
	
	
}
