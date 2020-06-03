package com.wanghang.projectsdk.third.feign;


import com.wanghang.projectsdk.third.controller.IProductController;
import com.wanghang.projectsdk.third.controller.IRemarkController;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "project-service1", path = "/jingdong")
public interface JDRemarkFeignClient extends IRemarkController {

}
