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
public class FeignClientFactory {


    // 京东
    private static JDProductFeignClient jdProductFeignClient;
    private static JDRemarkFeignClient jdRemarkFeignClient;
    private static JDOrderFeignClient jdOrderFeignClient;
    // 淘宝
    private static TBProductFeignClient tbProductFeignClient;
    private static TBRemarkFeignClient tbRemarkFeignClient;
    private static TBOrderFeignClient tbOrderFeignClient;

    @Autowired(required = false)
    public void setJdFeignClient(JDProductFeignClient jdProductFeignClient,
                                 JDRemarkFeignClient jdRemarkFeignClient,
                                 JDOrderFeignClient jdOrderFeignClient) {
        FeignClientFactory.jdProductFeignClient = jdProductFeignClient;
        FeignClientFactory.jdRemarkFeignClient = jdRemarkFeignClient;
        FeignClientFactory.jdOrderFeignClient = jdOrderFeignClient;
    }

    @Autowired(required = false)
    public void setTbFeignClient(TBProductFeignClient tbProductFeignClient,
                                 TBRemarkFeignClient tbRemarkFeignClient,
                                 TBOrderFeignClient tbOrderFeignClient) {
        FeignClientFactory.tbProductFeignClient = tbProductFeignClient;
        FeignClientFactory.tbRemarkFeignClient = tbRemarkFeignClient;
        FeignClientFactory.tbOrderFeignClient = tbOrderFeignClient;
    }


    public static IProductController createProductFeign(ProductSourceType type) {
        switch (type) {
            case JINGDONG:
                return jdProductFeignClient;
            case TAOBAO:
                return tbProductFeignClient;
            default:
                return null;
        }
    }

    public static IRemarkController createRemarkFeign(ProductSourceType type) {
        switch (type) {
            case JINGDONG:
                return jdRemarkFeignClient;
            case TAOBAO:
                return tbRemarkFeignClient;
            default:
                return null;
        }
    }

    public static IOrderController createOrderFeign(ProductSourceType type) {
        switch (type) {
            case JINGDONG:
                return jdOrderFeignClient;
            case TAOBAO:
                return tbOrderFeignClient;
            default:
                return null;
        }
    }
}
