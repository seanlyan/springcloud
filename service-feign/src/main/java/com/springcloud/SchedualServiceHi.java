package com.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sean on 2017/7/14.
 * FeignClient(服务名)
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    //1. @GetMapping("/hello/{name}")
    //1. String sayHiFromClientOne(@PathVariable(value = "name") String name);
    @GetMapping("/hello")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
