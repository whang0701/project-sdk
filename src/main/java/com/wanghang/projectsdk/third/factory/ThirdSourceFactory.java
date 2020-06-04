package com.wanghang.projectsdk.third.factory;

import com.wanghang.projectsdk.base.enumeration.ProductSourceType;
import com.wanghang.projectsdk.third.controller.IOrderController;
import com.wanghang.projectsdk.third.controller.IProductController;
import com.wanghang.projectsdk.third.controller.IRemarkController;
import com.wanghang.projectsdk.third.feign.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wanghang
 * 2020/5/17
 **/
@Component
public class ThirdSourceFactory {

    private static JDFeignClientFactory jdFeignClientFactory;

    private static TBFeignClientFactory tbFeignClientFactory;

    @Autowired(required = false)
    public void setJdFeignClient(JDFeignClientFactory jdFeignClientFactory,
                                 TBFeignClientFactory tbFeignClientFactory) {
        ThirdSourceFactory.jdFeignClientFactory = jdFeignClientFactory;
        ThirdSourceFactory.tbFeignClientFactory = tbFeignClientFactory;
    }

    public static IFeignClientFactory createSourceFactory(ProductSourceType type) {
        switch (type) {
            case JINGDONG:
                return jdFeignClientFactory;
            case TAOBAO:
                return tbFeignClientFactory;
            default:
                return null;
        }
    }
}
