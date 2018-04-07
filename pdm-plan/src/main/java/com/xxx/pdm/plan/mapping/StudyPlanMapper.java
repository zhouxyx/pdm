package com.xxx.pdm.plan.mapping;

import com.xxx.pdm.plan.model.StudyPlan;
import com.xxx.pdm.plan.model.StudyPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyPlanMapper {
    int countByExample(StudyPlanExample example);

    int deleteByExample(StudyPlanExample example);

    int deleteByPrimaryKey(String planUid);

    int insert(StudyPlan record);

    int insertSelective(StudyPlan record);

    List<StudyPlan> selectByExample(StudyPlanExample example);

    StudyPlan selectByPrimaryKey(String planUid);

    int updateByExampleSelective(@Param("record") StudyPlan record, @Param("example") StudyPlanExample example);

    int updateByExample(@Param("record") StudyPlan record, @Param("example") StudyPlanExample example);

    int updateByPrimaryKeySelective(StudyPlan record);

    int updateByPrimaryKey(StudyPlan record);
}