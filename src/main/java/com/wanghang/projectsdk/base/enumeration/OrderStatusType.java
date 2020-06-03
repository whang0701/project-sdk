package com.wanghang.projectsdk.base.enumeration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum OrderStatusType {
    INIT(0, "初始化"),
    BEFORE_DELIVERY(1, "待发货"),
    DELIVERYING(2, "运输中"),
    BEFORE_RECEIVE(3, "待收货"),
    RCEIVED(4, "已签收"),
    REMARKED(5, "已评价"),
    REFUNDIND(6, "退款中"),
    RETURNED(7, "已退货");


    private Integer key;
    private String value;

    OrderStatusType(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static OrderStatusType getType(Integer key) {
        for (OrderStatusType type : values()) {
            if (type.key.equals(key)) {
                return type;
            }
        }
        log.error("No matching constant for [" + key + "]");
        return null;
    }
}
