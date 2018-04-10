package com.xxx.pdm.inexp.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.pdm.inexp.mapping.UserInExpMapper;
import com.xxx.pdm.inexp.model.UserInExp;
import com.xxx.pdm.inexp.model.UserInExpExample;
import com.xxx.pdm.inexp.service.InExpService;
import com.xxx.pdm.inexp.util.DateUtil;
import com.xxx.pdm.inexp.util.UUIDUtil;

@Service
public class InExpServiceImpl implements InExpService{

	@Autowired
	private UserInExpMapper userInExpMapper;
	
	
	public List<UserInExp> queryUserInExpByMonth(String userUid, int month) {
		UserInExpExample example = new UserInExpExample();
		example.createCriteria().andYearEqualTo(DateUtil.getCurrentYear()).andMonthEqualTo(month).andUserUidEqualTo(userUid);
		List<UserInExp> userInExps = userInExpMapper.selectByExample(example);
		return userInExps;
	}


	public int saveUserInExp(UserInExp userInExp) {
		userInExp.setUserInexpUid(UUIDUtil.genUUID());
		userInExp.setYear(DateUtil.getCurrentYear());
		userInExp.setMonth(DateUtil.getCurrentMonth());
		userInExp.setInexpDate(new Date());
		return userInExpMapper.insertSelective(userInExp);
	}


	public List<Map<String, Object>> statUserInExpTypeByMonth(String userUid, Integer month,Integer year) {
		
		return userInExpMapper.statUserInExpTypeByMonth(userUid, month, year);
	}

	
}
