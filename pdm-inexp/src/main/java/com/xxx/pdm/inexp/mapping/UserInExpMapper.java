package com.xxx.pdm.inexp.mapping;

import com.xxx.pdm.inexp.model.UserInExp;
import com.xxx.pdm.inexp.model.UserInExpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInExpMapper {
    int countByExample(UserInExpExample example);

    int deleteByExample(UserInExpExample example);

    int deleteByPrimaryKey(String userInexpUid);

    int insert(UserInExp record);

    int insertSelective(UserInExp record);

    List<UserInExp> selectByExample(UserInExpExample example);

    UserInExp selectByPrimaryKey(String userInexpUid);

    int updateByExampleSelective(@Param("record") UserInExp record, @Param("example") UserInExpExample example);

    int updateByExample(@Param("record") UserInExp record, @Param("example") UserInExpExample example);

    int updateByPrimaryKeySelective(UserInExp record);

    int updateByPrimaryKey(UserInExp record);
}