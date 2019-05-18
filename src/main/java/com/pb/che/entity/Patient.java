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

	private Date startitme;// 住院时间
	
	private Date endtitme;// 住院时间
	
	private Integer pcid;//最新的病情
	
	private Integer pcdId;//最新的治疗方案；

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

	public Integer getPcid()
	{
		return pcid;
	}

	public void setPcid(Integer pcid)
	{
		this.pcid = pcid;
	}

	public Integer getPcdId()
	{
		return pcdId;
	}

	public void setPcdId(Integer pcdId)
	{
		this.pcdId = pcdId;
	}
	

}
