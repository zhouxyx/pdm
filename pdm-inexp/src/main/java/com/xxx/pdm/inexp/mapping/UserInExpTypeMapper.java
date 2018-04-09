package com.xxx.pdm.inexp.mapping;

import com.xxx.pdm.inexp.model.UserInExpType;
import com.xxx.pdm.inexp.model.UserInExpTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInExpTypeMapper {
    int countByExample(UserInExpTypeExample example);

    int deleteByExample(UserInExpTypeExample example);

    int deleteByPrimaryKey(String userInexpTypeUid);

    int insert(UserInExpType record);

    int insertSelective(UserInExpType record);

    List<UserInExpType> selectByExample(UserInExpTypeExample example);

    UserInExpType selectByPrimaryKey(String userInexpTypeUid);

    int updateByExampleSelective(@Param("record") UserInExpType record, @Param("example") UserInExpTypeExample example);

    int updateByExample(@Param("record") UserInExpType record, @Param("example") UserInExpTypeExample example);

    int updateByPrimaryKeySelective(UserInExpType record);

    int updateByPrimaryKey(UserInExpType record);
}