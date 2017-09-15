package com.alimy.sbmb.dao;

import com.alimy.sbmb.entity.Item;

public interface ItemMapper {
    int deleteByPrimaryKey(String itemId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(String itemId);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}