package com.xxx.pdm.plan.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.pdm.plan.common.ResultVo;
import com.xxx.pdm.plan.model.StudyPlan;
import com.xxx.pdm.plan.service.PlanService;

@RestController
public class StudyPlanController {

	@Autowired
	private PlanService planService;

	@GetMapping(value = "/plans/{month}")
	public List<StudyPlan> studyPlanByMonth(@PathVariable("month") Integer month) {
		return planService.findStudyPlansByMonth(month);
	}
	
	@PostMapping("/plans")
	public ResultVo saveStudyPlan(@RequestBody StudyPlan studyPlan) {
		
		int res = planService.saveStudyPlan(studyPlan);
		
		if(res>0) {
			return new ResultVo.Builder().status("200").build();
		}else {
			return new ResultVo.Builder().status("400").build();
		}
	}

}
