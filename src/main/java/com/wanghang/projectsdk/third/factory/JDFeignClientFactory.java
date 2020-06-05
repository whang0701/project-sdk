package com.wanghang.projectsdk.third.factory;

import com.wanghang.projectsdk.third.controller.IOrderController;
import com.wanghang.projectsdk.third.controller.IProductController;
import com.wanghang.projectsdk.third.controller.IRemarkController;
import com.wanghang.projectsdk.third.feign.JDOrderFeignClient;
import com.wanghang.projectsdk.third.feign.JDProductFeignClient;
import com.wanghang.projectsdk.third.feign.JDRemarkFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wanghang
 * @date 2020/6/4
 **/
@Component
public class JDFeignClientFactory implements IFeignClientFactory {

    @Autowired
    private JDProductFeignClient jdProductFeignClient;

    @Autowired
    private JDRemarkFeignClient jdRemarkFeignClient;

    @Autowired
    private JDOrderFeignClient jdOrderFeignClient;


    @Override
    public IProductController createProductFeign() {
        return this.jdProductFeignClient;
    }

    @Override
    public IRemarkController createRemarkFeign() {
        return this.jdRemarkFeignClient;
    }

    @Override
    public IOrderController createOrderFeign() {
        return this.jdOrderFeignClient;
    }
}
