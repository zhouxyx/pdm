package com.xxx.pdm.plan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.pdm.plan.mapping.StudyPlanMapper;
import com.xxx.pdm.plan.model.StudyPlan;
import com.xxx.pdm.plan.model.StudyPlanExample;
import com.xxx.pdm.plan.service.PlanService;
import com.xxx.pdm.plan.util.DateUtil;
import com.xxx.pdm.plan.util.UUIDUtil;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private StudyPlanMapper studyPlanMapper;

	public List<StudyPlan> findStudyPlansByMonth(int month) {
		StudyPlanExample example = new StudyPlanExample();
		example.createCriteria().andMonthEqualTo(month);
		List<StudyPlan> studyPlans = studyPlanMapper.selectByExample(example);
		return studyPlans;
	}

	public int saveStudyPlan(StudyPlan studyPlan) {
		studyPlan.setPlanUid(UUIDUtil.genUUID());
		studyPlan.setYear(DateUtil.getCurrentYear());
		studyPlan.setMonth(DateUtil.getCurrentMonth());
		return studyPlanMapper.insertSelective(studyPlan);
	}

	public int updateStudyPlan(StudyPlan studyPlan) {
		return studyPlanMapper.updateByPrimaryKeySelective(studyPlan);
	}

	public int updatePlanComplete(String planUid, Integer complete) {
		StudyPlan dbStudyPlan = studyPlanMapper.selectByPrimaryKey(planUid);
		Integer currentMonth = DateUtil.getCurrentMonth();
		Integer currentYear = DateUtil.getCurrentYear();
		if (dbStudyPlan == null) {
			return 0;
		}
		if (currentMonth.equals(dbStudyPlan.getMonth()) && currentYear.equals(dbStudyPlan.getYear())) {
			StudyPlan studyPlan = new StudyPlan();
			studyPlan.setComplete(complete);
			studyPlan.setPlanUid(planUid);
			int res = studyPlanMapper.updateByPrimaryKeySelective(studyPlan);
			return res;
		} else {
			return -9;
		}
	}

	public Integer queryCurrentMonthPlanComplete(Integer month) {
		StudyPlanExample example = new StudyPlanExample();
		example.createCriteria().andMonthEqualTo(month);
		List<StudyPlan> studyPlans = studyPlanMapper.selectByExample(example);
		Integer complete = 0;
		if (studyPlans != null && studyPlans.size() > 0) {
			for (StudyPlan studyPlan : studyPlans) {
				complete += studyPlan.getComplete();
			}
		}
		return complete;
	}
}
