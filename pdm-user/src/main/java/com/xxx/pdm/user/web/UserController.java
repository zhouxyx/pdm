package com.xxx.pdm.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.pdm.user.model.User;
import com.xxx.pdm.user.service.UserService;

@RestController
@RequestMapping(value="user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value="{userUid}")
	public User queryUserByUid(@PathVariable("userUid") String userUid) {
		return userService.queryUserByUId(userUid);
	}
}
