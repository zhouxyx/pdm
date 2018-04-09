package com.xxx.pdm.inexp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.pdm.inexp.common.ResultVo;
import com.xxx.pdm.inexp.model.UserInExp;
import com.xxx.pdm.inexp.service.InExpService;

@RestController
public class UserInExpController {

	@Autowired
	private InExpService inExpService;
	
	@GetMapping(value="/inexp/{userUid}/{month}")
	public List<UserInExp> queryUserInExpByMonth(@PathVariable("userUid")String userUid, @PathVariable("month")Integer month) {
		List<UserInExp> userInExps = inExpService.queryUserInExpByMonth(userUid, month);
		return userInExps;
	}
	
	
	@PostMapping(value="/inexp/user")
	public ResultVo saveUserInExp(@RequestBody UserInExp userInExp) {
		int res = inExpService.saveUserInExp(userInExp);
		if(res>0) {
			return new ResultVo("200","保存成功");
		}else {
			return new ResultVo("400","保存成功");
		}
	}
	
	
}
