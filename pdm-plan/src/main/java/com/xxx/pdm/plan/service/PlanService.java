package com.xxx.pdm.plan.service;

import java.util.List;

import com.xxx.pdm.plan.model.StudyPlan;

public interface PlanService {

	public List<StudyPlan> findStudyPlansByMonth(int month);
	
	public int saveStudyPlan(StudyPlan studyPlan);
	
	public int updateStudyPlan(StudyPlan studyPlan);
}
