package com.pb.che.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import sun.tools.jar.resources.jar;

@Data
@Entity
@Table(name = "t_user")

public class User  extends BaseEntity implements Serializable
{

	private static final long serialVersionUID = 1L;

	private String username;

	private String account;

	private String password;
	
	private String roletype;

	
	
	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getRoletype()
	{
		return roletype;
	}

	public void setRoletype(String roletype)
	{
		this.roletype = roletype;
	}


}
