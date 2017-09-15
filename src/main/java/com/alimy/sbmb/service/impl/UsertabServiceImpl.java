package com.alimy.sbmb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimy.sbmb.dao.UsertabMapper;
import com.alimy.sbmb.entity.Usertab;
import com.alimy.sbmb.service.UsertabService;
import com.alimy.sbmb.util.Utils;

@Service
public class UsertabServiceImpl implements UsertabService{
    
    @Autowired
    private UsertabMapper usertabMapper;

    public int addUser(Usertab usertab) {
        usertab.setUserId(Utils.getIdStr());
        int num = usertabMapper.addUser(usertab);
        return num;
    }

    public List<Usertab> listUser() {
        List<Usertab> list = usertabMapper.listUser();
        return list;
    }

    public Usertab getUserById(String userId) {
        Usertab usertab = this.usertabMapper.queryById(userId);
        return usertab;
    }

    public int updateUser(Usertab usertab) {
        Usertab u = this.usertabMapper.queryById(usertab.getUserId());
        if(u == null) {
            return 0;
        }
        return this.usertabMapper.updateUser(usertab);
    }

    public int deleteUser(String userId) {
        Usertab u = this.usertabMapper.queryById(userId);
        if(u == null) {
            return 0;
        }
        return this.usertabMapper.deleteUser(userId);
    }
    
    
    
}
