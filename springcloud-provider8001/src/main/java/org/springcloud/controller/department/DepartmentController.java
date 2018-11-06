package org.springcloud.controller.department;

import org.springcloud.entity.Department;
import org.springcloud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
	public Department selectByPrimaryKey(@PathVariable("id")Long id){
		return departmentService.selectByPrimaryKey(id);
	}



}
