package com.wanghang.projectsdk.third.controller;

import com.wanghang.projectsdk.base.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IProductController {
    @RequestMapping(value = "product/getListByRandom", method = RequestMethod.GET)
    List<Product> getListByRandom(@RequestParam("num") Integer num);

    @RequestMapping(value = "product/getOneByNo", method = RequestMethod.GET)
    Product getOneByNo(@RequestParam("no") String no);
}
