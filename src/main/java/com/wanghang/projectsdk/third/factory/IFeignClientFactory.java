package com.wanghang.projectsdk.third.factory;

import com.wanghang.projectsdk.third.controller.IOrderController;
import com.wanghang.projectsdk.third.controller.IProductController;
import com.wanghang.projectsdk.third.controller.IRemarkController;

/**
 * @author wanghang
 */
public interface IFeignClientFactory {

    IProductController createProductFeign();

    IRemarkController createRemarkFeign();

    IOrderController createOrderFeign();
}
