package com.richard.cloud.service;

import com.github.pagehelper.PageHelper;
import com.richard.cloud.bean.ManagerUser;
import com.richard.cloud.bean.ManagerUserExample;
import com.richard.cloud.mapper.ManagerUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private ManagerUserMapper managerUserMapper;

    public List getList() {
        PageHelper.startPage(1, 2);
        List<ManagerUser> list = managerUserMapper.selectByExample(new ManagerUserExample());
        return list;
    }

}
