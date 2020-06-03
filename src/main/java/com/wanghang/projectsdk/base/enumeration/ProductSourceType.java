package com.wanghang.projectsdk.base.enumeration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum ProductSourceType {
    JINGDONG(1, "京东"),
//    TAOBAO(2, "淘宝")
    ;


    private Integer key;
    private String value;

    ProductSourceType(Integer key, String value) {
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

    public static ProductSourceType getType(Integer key) {
        for (ProductSourceType type : values()) {
            if (type.key.equals(key)) {
                return type;
            }
        }
        log.error("No matching constant for [" + key + "]");
        return null;
    }
}
