package org.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springcloud.entity.Department;
import org.springcloud.service.DepartmentFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {


    @Autowired
    private DepartmentFeignClient departmentFeignClient =null;

    @RequestMapping(value = "/consumer/get/{id}",method = {RequestMethod.GET})
    //@HystrixCommand(fallbackMethod = "getFallback")
    public String getById(@PathVariable("id") long id){
        Department department = departmentFeignClient.getById(id);
        if(department ==null){
            throw new RuntimeException("查询的信息不存在");
        }
        return department.toString();
    }

    @RequestMapping(value = "/listAll",method = {RequestMethod.GET})
    public String listAll(){
        return departmentFeignClient.listAll().toString();
    }

   /* private String getFallback(long id){
       return new Department().setId(Long.MIN_VALUE).setDbSource("熔断测试数据").setName("熔断测试的名称").toString();
    }*/

}
