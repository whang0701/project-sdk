package com.wanghang.projectsdk.base.enumeration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum StateFlagType {
    INVALID(0, "无效"),
    VALID(1, "有效");

    private Integer key;
    private String value;

    StateFlagType(Integer key, String value) {
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

    public static StateFlagType getType(Integer key) {
        for (StateFlagType type : values()) {
            if (type.key.equals(key)) {
                return type;
            }
        }
        log.error("No matching constant for [" + key + "]");
        return null;
    }
}
