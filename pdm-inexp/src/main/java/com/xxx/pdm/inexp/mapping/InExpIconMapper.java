package com.xxx.pdm.inexp.mapping;

import com.xxx.pdm.inexp.model.InExpIcon;
import com.xxx.pdm.inexp.model.InExpIconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InExpIconMapper {
    int countByExample(InExpIconExample example);

    int deleteByExample(InExpIconExample example);

    int deleteByPrimaryKey(String iconUid);

    int insert(InExpIcon record);

    int insertSelective(InExpIcon record);

    List<InExpIcon> selectByExample(InExpIconExample example);

    InExpIcon selectByPrimaryKey(String iconUid);

    int updateByExampleSelective(@Param("record") InExpIcon record, @Param("example") InExpIconExample example);

    int updateByExample(@Param("record") InExpIcon record, @Param("example") InExpIconExample example);

    int updateByPrimaryKeySelective(InExpIcon record);

    int updateByPrimaryKey(InExpIcon record);
}