package com.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sean on 2017/7/14.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    /*
    @GetMapping("/hello/{name}")
    String sayHi(@PathVariable String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
    */
    @GetMapping("/hello")
    String sayHi(@RequestParam(value = "name")String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
