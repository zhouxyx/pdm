package com.xxx.pdm.inexp.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.pdm.inexp.common.ResultVo;
import com.xxx.pdm.inexp.model.UserInExp;
import com.xxx.pdm.inexp.service.InExpService;
import com.xxx.pdm.inexp.vo.InExpVo;

@RestController
public class UserInExpController {

	@Autowired
	private InExpService inExpService;

	@GetMapping(value = "/inexp/{userUid}/{month}")
	public List<UserInExp> queryUserInExpByMonth(@PathVariable("userUid") String userUid,
			@PathVariable("month") Integer month) {
		List<UserInExp> userInExps = inExpService.queryUserInExpByMonth(userUid, month);
		return userInExps;
	}

	/**
	 * 统计月份的收支情况
	 * @param userUid
	 * @param month
	 * @param year
	 * @return
	 */
	@GetMapping(value = "/inexp/stat/{userUid}/{year}-{month}")
	public List<Map<String, Object>> statUserInExpTypeByMonth(@PathVariable("userUid") String userUid,
			@PathVariable("month") Integer month, @PathVariable("year") Integer year) {
		List<Map<String, Object>> userInExpMaps = inExpService.statUserInExpTypeByMonth(userUid, month, year);
		return userInExpMaps;
	}

	/**
	 * 当月收支总数
	 * 
	 * @param userUid
	 * @param month
	 * @return
	 */
	@GetMapping(value = "/inexp/money/{userUid}/{month}")
	public InExpVo queryUserInExp(@PathVariable("userUid") String userUid, @PathVariable("month") Integer month) {
		List<UserInExp> userInExps = inExpService.queryUserInExpByMonth(userUid, month);
		double in = 0.0;
		double exp = 0.0;
		if (userInExps != null && userInExps.size() > 0) {

			for (UserInExp userInExp : userInExps) {
				if (userInExp.getInexpType().equals("0")) {
					in += userInExp.getMoney().doubleValue();
				} else {
					exp += userInExp.getMoney().doubleValue();
				}
			}
		}
		return new InExpVo(in, exp);
	}

	/**
	 * 新增收支情况
	 * 
	 * @param userInExp
	 * @return
	 */
	@PostMapping(value = "/inexp/user")
	public ResultVo saveUserInExp(@RequestBody UserInExp userInExp) {
		int res = inExpService.saveUserInExp(userInExp);
		if (res > 0) {
			return new ResultVo("200", "保存成功");
		} else {
			return new ResultVo("400", "保存成功");
		}
	}

}
