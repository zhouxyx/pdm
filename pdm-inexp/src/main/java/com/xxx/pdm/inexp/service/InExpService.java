package com.xxx.pdm.inexp.service;

import java.util.List;

import com.xxx.pdm.inexp.model.UserInExp;

public interface InExpService {

	public List<UserInExp> queryUserInExpByMonth(String userUid, int month);

	public int saveUserInExp(UserInExp userInExp);
}
