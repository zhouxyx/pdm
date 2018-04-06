package com.xxx.pdm.user.service;

import com.xxx.pdm.user.model.User;

public interface UserService {

	public User queryUserByUId(String userUid);
	
	public int saveUser(User user);
}
