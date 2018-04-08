package com.xxx.pdm.plan.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.pdm.plan.common.ResultVo;
import com.xxx.pdm.plan.model.StudyPlan;
import com.xxx.pdm.plan.service.PlanService;

@RestController
public class StudyPlanController {

	@Autowired
	private PlanService planService;

	/**
	 * 获取系统当月计划
	 * @param month
	 * @return
	 */
	@GetMapping(value = "/plans/{month}")
	public List<StudyPlan> studyPlanByMonth(@PathVariable("month") Integer month) {
		return planService.findStudyPlansByMonth(month);
	}

	/**
	 * 新增计划
	 * @param studyPlan
	 * @return
	 */
	@PostMapping("/plans")
	public ResultVo saveStudyPlan(@RequestBody StudyPlan studyPlan) {
		int res = planService.saveStudyPlan(studyPlan);
		if (res > 0) {
			return new ResultVo.Builder().status("200").build();
		} else {
			return new ResultVo.Builder().status("400").build();
		}
	}
	
	/**
	 * 更新计划
	 * @param studyPlan
	 * @return
	 */
	@PutMapping("/plans")
	public ResultVo updateStudyPlan(@RequestBody StudyPlan studyPlan) {
		int res = planService.updateStudyPlan(studyPlan);
		if (res > 0) {
			return new ResultVo.Builder().status("200").message("更新成功").build();
		} else {
			return new ResultVo.Builder().status("400").message("更新失败").build();
		}
	}

	/**
	 * 更新完成状态
	 * @param planUid
	 * @param complete
	 * @return
	 */
	@PostMapping(value = "/plans/{planUid}")
	public ResultVo updatePlanComplete(@PathVariable("planUid") String planUid,
			@RequestParam("complete") Integer complete) {
		int res = planService.updatePlanComplete(planUid, complete);
		if (res == -1) {
			return new ResultVo("400", "不是当月的计划不能修改");
		} else if (res == 0) {
			return new ResultVo("400", "计划修改失败");
		} else {
			return new ResultVo("200");
		}
	}
	
	/**
	 * 获取当月计划完成情况
	 * @param month
	 * @return
	 */
	@GetMapping(value="/plans/complete/{month}")
	public Integer queryCurrentMonthPlanComplete(@PathVariable("month") Integer month) {
		Integer complete = planService.queryCurrentMonthPlanComplete(month);
		return complete;
	}
	
	
}
