package com.pb.che.constant;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleTypeConstant
{

	public final static String ROLETYPE_FIRSTAD = "firstad";// 急救填报员

	public final static String ROLETYPE_CHESTPAIN = "chestpain";// 胸痛填报员

	public final static String ROLETYPE_FILE = "turnfile";// 转归填报员

	public final static String ROLETYPE_AUDIT = "audit";// 审核员

	public final static String ROLETYPE_FILELAST = "filelast";// 归档员

	public final static String ROLETYPE_COMMON = "common";// 受限用户

	public final static String ROLETYPE_ADMIN = "admin";// 管理员

	public final static String ROLETYPE_SYSTEM = "sys";// 受限用户

	public static Map<String, String> getAll()
	{
		Map<String, String> map = new HashMap<String, String>();
		try
		{
			Field[] fields = RoleTypeConstant.class.getFields();

			for (Field field : fields)
			{
				map.put(field.getName(), (String)(field.get(field.getName())));
			}
			return map;
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

	public static boolean containsValue(String roleType)
	{
      if(getAll().containsValue(roleType)){
    	  return true;
      }
      return false;
	}

	public static boolean containsValueNotSysAndAdmin(String roleType)
	{
		
		
      if(getAll().containsValue(roleType)){
    	  return true;
      }
      return false;
	}
}
