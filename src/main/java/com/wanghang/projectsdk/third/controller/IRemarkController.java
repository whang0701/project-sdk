package com.wanghang.projectsdk.third.controller;

import com.wanghang.projectsdk.base.entity.Product;
import com.wanghang.projectsdk.base.entity.Remark;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IRemarkController {
    @RequestMapping(value = "remark/getListByProductNoAndSkipAndLimit", method = RequestMethod.GET)
    List<Remark> getListByProductNoAndSkipAndLimit(@RequestParam("productNo") String productNo,
                                                   @RequestParam("skip") Integer skip,
                                                   @RequestParam("limit") Integer limit);

    @RequestMapping(value = "/remark/doRemark", method = RequestMethod.POST)
    String doRemark(@RequestBody Remark remark);
}
