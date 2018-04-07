package com.xxx.pdm.plan.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.pdm.plan.model.StudyPlan;
import com.xxx.pdm.plan.service.PlanService;

@RestController
public class StudyPlanController {

	@Autowired
	private PlanService planService;

	@GetMapping(value = "/plan/{month}")
	public List<StudyPlan> studyPlanByMonth(@PathVariable("month") Integer month) {
		return planService.findStudyPlansByMonth(month);
	}

}
