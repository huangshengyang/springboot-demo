package com.alimy.sbmb.dao;

import java.util.List;

import com.alimy.sbmb.entity.Usertab;

public interface UsertabMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Usertab record);

    int insertSelective(Usertab record);

    Usertab selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Usertab record);

    int updateByPrimaryKey(Usertab record);
    
    
    List<Usertab> listUser();
    
    Usertab queryById(String userId);
    
    int addUser(Usertab usertab);
    
    int updateUser(Usertab usertab);
    
    int deleteUser(String userId);
    
}