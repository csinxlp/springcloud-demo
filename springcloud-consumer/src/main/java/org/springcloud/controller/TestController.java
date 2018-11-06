package org.springcloud.controller;

import org.springcloud.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    public static final String  url ="http://DEPARTMENT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/test/{id}")
    public  Department test(@PathVariable("id") String id){
        System.out.println("id = [" + id + "]");
        return  restTemplate.getForObject(url+"/get/"+id, Department.class);
    }

    @RequestMapping(value = "/test2")
    public String test2(){
        return "hello world";
    }

}
