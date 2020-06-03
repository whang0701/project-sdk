package com.wanghang.projectsdk.third.factory;

import com.wanghang.projectsdk.base.enumeration.ProductSourceType;
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
 * 2020/5/17
 **/
@Component
public class FeignClientFactory {


    private static JDProductFeignClient jdProductFeignClient;

//    private static TBProductFeignClient tbProductFeignClient;

    private static JDRemarkFeignClient jdRemarkFeignClient;


    private static JDOrderFeignClient jdOrderFeignClient;

    @Autowired(required = false)
    public void setJdProductFeignClient(JDProductFeignClient jdProductFeignClient) {
        FeignClientFactory.jdProductFeignClient = jdProductFeignClient;
    }

//    @Autowired(required = false)
//    public void setTbProductFeignClient(TBProductFeignClient tbProductFeignClient) {
//        ProductFeignFactory.tbProductFeignClient = tbProductFeignClient;
//    }

    @Autowired(required = false)
    public void setJdRemarkFeignClient(JDRemarkFeignClient jdRemarkFeignClient) {
        FeignClientFactory.jdRemarkFeignClient = jdRemarkFeignClient;
    }

    @Autowired(required = false)
    public void setJDOrderFeignClient(JDOrderFeignClient jdOrderFeignClient) {
        FeignClientFactory.jdOrderFeignClient = jdOrderFeignClient;
    }


    public static IProductController createProductFeign(ProductSourceType type) {
        switch (type) {
            case JINGDONG:
                return jdProductFeignClient;
//            case TAOBAO:
//                return tbProductFeignClient;
            default:
                return null;
        }
    }

    public static IRemarkController createRemarkFeign(ProductSourceType type) {
        switch (type) {
            case JINGDONG:
                return jdRemarkFeignClient;
//            case TAOBAO:
//                return tbProductFeignClient;
            default:
                return null;
        }
    }

    public static IOrderController createOrderFeign(ProductSourceType type) {
        switch (type) {
            case JINGDONG:
                return jdOrderFeignClient;
//            case TAOBAO:
//                return tbProductFeignClient;
            default:
                return null;
        }
    }
}
