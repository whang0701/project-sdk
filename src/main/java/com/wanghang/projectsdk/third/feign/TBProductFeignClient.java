package com.wanghang.projectsdk.third.feign;


import com.wanghang.projectsdk.third.controller.IProductController;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "project-service2", path = "/taobao")
public interface TBProductFeignClient extends IProductController {

}
