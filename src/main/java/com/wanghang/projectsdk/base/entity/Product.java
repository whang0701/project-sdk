package com.wanghang.projectsdk.base.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Product {

    private String no;

    private Integer source;

    private String sourceName;

    private String name;

    private Integer type;

    private String typeName;

    private String brand;

    private BigDecimal price;

    private String img0;

    private String img1;

    private String img2;

    private BigDecimal star;

    private String store;

    private String address;

    private List<String> tags;

    private Date birth;

    private String desc;

}