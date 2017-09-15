package com.alimy.sbmb.dao;

import com.alimy.sbmb.entity.Ordertab;

public interface OrdertabMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Ordertab record);

    int insertSelective(Ordertab record);

    Ordertab selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Ordertab record);

    int updateByPrimaryKey(Ordertab record);
}