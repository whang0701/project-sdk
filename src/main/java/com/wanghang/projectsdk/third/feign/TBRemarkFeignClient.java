package com.wanghang.projectsdk.third.feign;


import com.wanghang.projectsdk.third.controller.IRemarkController;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "project-service2", path = "/taobao")
public interface TBRemarkFeignClient extends IRemarkController {

}
