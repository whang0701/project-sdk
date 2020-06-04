package com.wanghang.projectsdk.third.factory;

import com.wanghang.projectsdk.third.controller.IOrderController;
import com.wanghang.projectsdk.third.controller.IProductController;
import com.wanghang.projectsdk.third.controller.IRemarkController;
import com.wanghang.projectsdk.third.feign.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wanghang
 * @date 2020/6/4
 **/
public class TBFeignClientFactory implements IFeignClientFactory {

    @Autowired
    private TBProductFeignClient tbProductFeignClient;

    @Autowired
    private TBRemarkFeignClient tbRemarkFeignClient;

    @Autowired
    private TBOrderFeignClient tbOrderFeignClient;


    @Override
    public IProductController createProductFeign() {
        return this.tbProductFeignClient;
    }

    @Override
    public IRemarkController createRemarkFeign() {
        return this.tbRemarkFeignClient;
    }

    @Override
    public IOrderController createOrderFeign() {
        return this.tbOrderFeignClient;
    }
}
