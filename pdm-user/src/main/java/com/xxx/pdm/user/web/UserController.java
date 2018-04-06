package com.xxx.pdm.user.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.pdm.user.common.ResultVo;
import com.xxx.pdm.user.model.User;
import com.xxx.pdm.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/users/{userUid}")
	public User queryUserByUid(@PathVariable("userUid") String userUid) {
		return userService.queryUserByUId(userUid);
	}

	@PostMapping(value = "/users")
	public ResultVo saveUser(@RequestBody User user) {
		user.setRegDate(new Date());
		String status = "200";
		int res = userService.saveUser(user);
		if (res == 0) {
			status = "400";
		}
		return new ResultVo.Builder().status(status).build();
	}

}
