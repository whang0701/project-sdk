package com.wanghang.projectsdk.base.enumeration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum ProductType {
    PC(1, "台式电脑"),
    NOTEBOOK_PC(2, "笔记本电脑"),
    MOUSE(3, "鼠标"),
    KEYBOARD(4, "键盘"),
    HARDDISK(5, "硬盘"),
    GRAPHICS_CARD(6, "显卡"),
    VOICE_BOX(7, "音箱"),
    MONITOR(8, "显示器"),
    WEBCAM(9, "摄像头"),
    EARPHONE(10, "耳机"),
    CAMERA(11, "相机"),
    TABLET_PC(12, "平板电脑"),
    PHONE(13, "手机"),
    ROUTER(14, "路由器");


    private Integer key;
    private String value;

    ProductType(Integer key, String value) {
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

    public static ProductType getType(Integer key) {
        for (ProductType type : values()) {
            if (type.key.equals(key)) {
                return type;
            }
        }
        log.error("No matching constant for [" + key + "]");
        return null;
    }
}
