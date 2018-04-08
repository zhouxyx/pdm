package com.xxx.pdm.plan.service;

import java.util.List;

import com.xxx.pdm.plan.model.StudyPlan;

public interface PlanService {

	public List<StudyPlan> findStudyPlansByMonth(int month);
	
	public int saveStudyPlan(StudyPlan studyPlan);
	
	public int updateStudyPlan(StudyPlan studyPlan);

	/**
	 * 更新计划完成的状态
	 * @param planUid
	 * @param complete
	 * @return
	 */
	public int updatePlanComplete(String planUid, Integer complete);
	
	/**
	 * 获取当月计划完成情况
	 * @param month
	 * @return
	 */
	public Integer queryCurrentMonthPlanComplete(Integer month);
}
