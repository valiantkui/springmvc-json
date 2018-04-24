package com.kui.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kui.entity.User;

@Controller
public class JsonController {
	
	@RequestMapping("/json1")
	@ResponseBody	//调用jackson
	public User loadUser() {
		User user = new User();
		user.setName("jack");
		user.setAge(18);
		user.setId(1);
		return user;
	}
	
	@RequestMapping("/json2")
	@ResponseBody	//调用jackson
	public List<User> loadUsers(){
		List<User> userList = new ArrayList<User>();
		User user1 = new User(2,"hongmu",20);
		User user2 = new User(3,"mingyuan",20);
		User user3 = new User(4,"shaonan",19);
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		return userList;
	}
	
	@RequestMapping("/json3")
	@ResponseBody	//调用jackson
	public Map<String,Object> loadData(){
		Map<String,Object> dataMap = new HashMap<String,Object>();
		dataMap.put("id", 1);
		dataMap.put("name", "狗蛋儿二");
		return dataMap;
	}
	
}
