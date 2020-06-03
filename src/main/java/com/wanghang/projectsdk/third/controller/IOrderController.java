package com.wanghang.projectsdk.third.controller;

import com.wanghang.projectsdk.base.entity.Order;
import com.wanghang.projectsdk.base.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IOrderController {
    @RequestMapping(value = "order/doPlace", method = RequestMethod.POST)
    String doPlace(@RequestBody Order order);

    @RequestMapping(value = "order/doReceive", method = RequestMethod.GET)
    Integer doReceive(@RequestParam("no") String no);

    @RequestMapping(value = "order/doRemark", method = RequestMethod.POST)
    Integer doRemark(@RequestParam("no") String no);

    @RequestMapping(value = "order/doRefund", method = RequestMethod.POST)
    Integer doRefund(@RequestParam("no") String no, @RequestParam("desc") String desc);
}
