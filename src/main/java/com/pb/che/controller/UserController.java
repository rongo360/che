package com.pb.che.controller;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pb.che.annotation.Authority;
import com.pb.che.constant.RoleTypeConstant;
import com.pb.che.entity.User;
import com.pb.che.repository.HospitalRepository;
import com.pb.che.service.UserService;
import com.pb.che.utils.ResultObject;

@RestController
@RequestMapping("/user")
public class UserController
{

	@Autowired
	private UserService userService;


	@GetMapping("/get")
	public ResultObject get(String data)
	{

		ResultObject result = new ResultObject();
		JSONObject jsonObject = JSONObject.parseObject(data);
		int id = jsonObject.getIntValue("id");
		User user = userService.get(id);
		result.setData(user);
		return result;
	}

	@PostMapping("/save")
    @Authority(roleType={
    		RoleTypeConstant.ROLETYPE_ADMIN})
	public ResultObject save(String data)
	{
		ResultObject result = new ResultObject();
		User user = JSONObject.parseObject(data, User.class);
		userService.save(user);
		return result;
	}

	@PostMapping("/save")
    @Authority(roleType={
    		RoleTypeConstant.ROLETYPE_SYSTEM})
	public ResultObject createAdmin(String data)
	{
		ResultObject result = new ResultObject();
		User user = JSONObject.parseObject(data, User.class);
		userService.createAdmin(user);
		return result;
	}


	@PostMapping("/update")
	public ResultObject update(String data)
	{
		ResultObject result = new ResultObject();
		User user = JSONObject.parseObject(data, User.class);
		userService.save(user);
		return result;
	}
	
	
	@PostMapping("/updatePassword")
	public ResultObject updatePassword(String data)
	{
		ResultObject result = new ResultObject();
        userService.updatePassword(data);
		return result;
	}
	
	@PostMapping("/resetPassword")
	@Authority(roleType={RoleTypeConstant.ROLETYPE_SYSTEM,RoleTypeConstant.ROLETYPE_ADMIN})
	public ResultObject resetPassword(String data)
	{
		ResultObject result = new ResultObject();
        userService.resetPassword(data);
		return result;
	}
	
	
	

}
