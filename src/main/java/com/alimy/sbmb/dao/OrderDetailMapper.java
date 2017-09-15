package com.alimy.sbmb.dao;

import com.alimy.sbmb.entity.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(String orderdetailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(String orderdetailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}