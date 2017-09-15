package com.alimy.sbmb.service;

import java.util.List;

import com.alimy.sbmb.entity.Usertab;

public interface UsertabService {

    int addUser(Usertab usertab);
    
    List<Usertab> listUser();
    
    Usertab getUserById(String userId);
    
    int updateUser(Usertab usertab);
    
    int deleteUser(String userId);
    
}
