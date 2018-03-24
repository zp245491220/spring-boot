package com.richard.cloud.mapper;

import com.richard.cloud.bean.ManagerUser;
import com.richard.cloud.bean.ManagerUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerUserMapper {
    long countByExample(ManagerUserExample example);

    int deleteByExample(ManagerUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ManagerUser record);

    int insertSelective(ManagerUser record);

    List<ManagerUser> selectByExample(ManagerUserExample example);

    ManagerUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ManagerUser record, @Param("example") ManagerUserExample example);

    int updateByExample(@Param("record") ManagerUser record, @Param("example") ManagerUserExample example);

    int updateByPrimaryKeySelective(ManagerUser record);

    int updateByPrimaryKey(ManagerUser record);
}