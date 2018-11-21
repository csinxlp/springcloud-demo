package org.springcloud.service;

import org.springcloud.entity.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 部门接口
 * @author chenxinming
 * @version 1.0
 */
@FeignClient(value = "department")
public interface DepartmentFeignClient {
    /**
     * 根据id查询单个部门
     * @param id 部门id
     * @return Department
     */
    @RequestMapping(value="/get/{id}",method = {RequestMethod.GET})
    public Department getById(@PathVariable("id") long id);

    /**
     * 查询部门列表
     * @return 部门集合
     */
    @RequestMapping(value="/list",method = {RequestMethod.GET})
    public List<Department> listAll();
}
