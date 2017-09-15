package com.alimy.sbmb.entity;

import java.math.BigDecimal;

public class OrderDetail {
    private String orderdetailId;

    private String orderId;

    private String itemId;

    private BigDecimal itemNum;

    public String getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(String orderdetailId) {
        this.orderdetailId = orderdetailId == null ? null : orderdetailId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public BigDecimal getItemNum() {
        return itemNum;
    }

    public void setItemNum(BigDecimal itemNum) {
        this.itemNum = itemNum;
    }
}