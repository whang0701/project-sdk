package com.wanghang.projectsdk.third.feign;


import com.wanghang.projectsdk.third.controller.IOrderController;
import com.wanghang.projectsdk.third.controller.IProductController;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "project-service1", path = "/jingdong")
public interface JDOrderFeignClient extends IOrderController {

}
