package com.xxx.pdm.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.pdm.user.mapping.UserMapper;
import com.xxx.pdm.user.model.User;
import com.xxx.pdm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User queryUserByUId(String userUid) {
		return userMapper.selectByPrimaryKey(userUid);
	}
	
	
	
}
