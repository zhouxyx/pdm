package com.xxx.pdm.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.pdm.user.mapping.UserMapper;
import com.xxx.pdm.user.model.User;
import com.xxx.pdm.user.model.UserExample;
import com.xxx.pdm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User queryUserByUId(String userUid) {
		return userMapper.selectByPrimaryKey(userUid);
	}
	
	public int saveUser(User user) {
		
		return userMapper.insertSelective(user);
		
	}

	public User login(String phone, String password) {
		UserExample example = new UserExample();
		example.createCriteria().andPhoneEqualTo(phone);
		List<User> users = userMapper.selectByExample(example);
		if(null!=users && users.size()>1) {
			return null;
		}
		User user = users.get(0);
		if(user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
	
}
