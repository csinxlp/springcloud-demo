package org.springcloud.controller;

import org.springcloud.entity.Department;
import org.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

   @Autowired
   private TestService testService;

    @RequestMapping(value = "/test/{id}")
    public  Department test(@PathVariable("id") String id){
        return  testService.getById(Long.parseLong(id));
    }

    @RequestMapping(value = "/test2")
    public String test2(){
        return "hello world";
    }

}
