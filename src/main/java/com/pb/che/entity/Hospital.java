package com.pb.che.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="t_hospital")
public class Hospital extends BaseEntity
{

	private String hosname;
	
	private String adderss; 
	
	
}
