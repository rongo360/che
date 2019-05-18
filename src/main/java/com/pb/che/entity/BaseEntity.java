package com.pb.che.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass  
public class BaseEntity implements Serializable
{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;//主键
	private int flag = 1;
	private int creator;// 创建者
	private Date createtime = new Date();// 创建时间
	private int updator;// 更新者
	private Date updatetime = new Date();// 更新时间
	private String hoscode;// 医院编码
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getFlag()
	{
		return flag;
	}
	public void setFlag(int flag)
	{
		this.flag = flag;
	}
	public int getCreator()
	{
		return creator;
	}
	public void setCreator(int creator)
	{
		this.creator = creator;
	}
	public Date getCreatetime()
	{
		return createtime;
	}
	public void setCreatetime(Date createtime)
	{
		this.createtime = createtime;
	}
	public int getUpdator()
	{
		return updator;
	}
	public void setUpdator(int updator)
	{
		this.updator = updator;
	}
	public Date getUpdatetime()
	{
		return updatetime;
	}
	public void setUpdatetime(Date updatetime)
	{
		this.updatetime = updatetime;
	}
	public String getHoscode()
	{
		return hoscode;
	}
	public void setHoscode(String hoscode)
	{
		this.hoscode = hoscode;
	}
	
	
	
}
