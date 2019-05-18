package com.pb.che.utils;

import java.io.Serializable;

public class ResultObject implements Serializable
{


	private static final long serialVersionUID = 1L;
	private Object data;
	private boolean success=true;
	private String message;
	private int code=0;
	public Object getData()
	{
		return data;
	}
	public void setData(Object data)
	{
		this.data = data;
	}
	public boolean isSuccess()
	{
		return success;
	}
	public void setSuccess(boolean success)
	{
		this.success = success;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public int getCode()
	{
		return code;
	}
	public void setCode(int code)
	{
		this.code = code;
	}
	public ResultObject()
	{
		
	}
	
	
	
	
}
