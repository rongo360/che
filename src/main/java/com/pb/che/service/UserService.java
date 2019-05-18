package com.pb.che.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pb.che.constant.RoleTypeConstant;
import com.pb.che.context.CurrentUserContext;
import com.pb.che.context.UserDomain;
import com.pb.che.entity.Hospital;
import com.pb.che.entity.User;
import com.pb.che.repository.HospitalRepository;
import com.pb.che.repository.UserRepository;
import com.pb.che.utils.ResultObject;

@Service
public class UserService
{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private HospitalRepository hospitalRepository;
	
	public ResultObject createAdmin(User user)
	{
		
		ResultObject resultObject=new ResultObject();
		User user2=userRepository.getByAccount(user.getAccount());
		 if(user2!=null){
			 resultObject.setSuccess(false);
			 resultObject.setMessage("账号存在,请重新输入");
			 return resultObject;
		 }
		 UserDomain userDomain=CurrentUserContext.get();
		 Date date=new Date();
		 String hoscode=user.getHoscode();//这个医院是否存在
		Hospital hospital=hospitalRepository.getByHosode(hoscode);
		if(hospital==null){
			 resultObject.setSuccess(false);
			 resultObject.setMessage("医院不存在");
			 return resultObject;
		} 
		
		 user.setRoletype(RoleTypeConstant.ROLETYPE_ADMIN);
		 user.setCreatetime(date);
		 user.setUpdatetime(date);
		 user.setCreator(userDomain.getId());
		 user.setUpdator(userDomain.getId());
		 userRepository.save(user);
		
		return resultObject;
	}

	
	public ResultObject save(User user)
	{
		
		ResultObject resultObject=new ResultObject();
		/**
		 * 账号和密码验证
		 */
		 
		User user2=userRepository.getByAccount(user.getAccount());
		 if(user2!=null){
			 resultObject.setSuccess(false);
			 resultObject.setMessage("账号存在,请重新输入");
			 return resultObject;
		 }
		UserDomain userDomain=CurrentUserContext.get();
		String roleType=userDomain.getRoletype();//判断
        RoleTypeConstant.containsValue(roleType);
		if(roleType.equals(RoleTypeConstant.ROLETYPE_SYSTEM)||
				roleType.equals(RoleTypeConstant.ROLETYPE_ADMIN)){
			 resultObject.setSuccess(false);
			 resultObject.setMessage("输入的角色错误");
			 return resultObject;
		}
		Date date=new Date();
		user.setCreatetime(date);
		user.setCreator(userDomain.getId());
		user.setUpdatetime(date);
		user.setUpdator(userDomain.getId());
		user.setHoscode(userDomain.getHoscode());//医院
        
		userRepository.save(user);
		
		return resultObject;
	}

	public User get(Integer id)
	{

		return userRepository.getOne(id);
	}

	public void update(User user)
	{

	}

	public ResultObject updatePassword(String data){
		
		ResultObject resultObject=new ResultObject();
		JSONObject jsonObject=JSONObject.parseObject(data);
		String account=jsonObject.getString("account");
		String password=jsonObject.getString("password");
		String password2=jsonObject.getString("newpassword");
		if(password2.equals(password)){//
			 resultObject.setSuccess(false);
			 resultObject.setMessage("两次密码不可以相同");
			 return resultObject;
		}
		
		UserDomain userDomain=CurrentUserContext.get();
		User user=userRepository.getByAccount(account,userDomain.getHoscode());
		if(!user.getPassword().equals(password)){
			 resultObject.setSuccess(false);
			 resultObject.setMessage("密码错误");
			 return resultObject;
		}
		
		userRepository.updatePassword(password2, account, userDomain.getHoscode());
		return resultObject;
	}
	
}
