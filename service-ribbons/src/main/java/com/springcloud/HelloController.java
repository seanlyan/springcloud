package com.springcloud;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/7/13.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    /*
    @GetMapping("/hello/{name}")
    public String hi(@PathVariable String name) {
        StringBuilder sb = new StringBuilder();
        String tmp;
        for ( int i=0; i<5; i++ )
        {
            tmp = helloService.hiService(name);
            sb.append(tmp);
        }
        return sb.toString();
    }
    */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name") String name) {
        StringBuilder sb = new StringBuilder();
        String tmp;
        for ( int i=0; i<5; i++ )
        {
            tmp = helloService.hiService(name);
            sb.append(tmp);
        }
        return sb.toString();
    }
}
