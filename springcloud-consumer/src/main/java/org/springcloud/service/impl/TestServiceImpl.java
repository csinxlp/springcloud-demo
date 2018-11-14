package org.springcloud.service.impl;

import org.springcloud.entity.Department;
import org.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Logger;

@Service
public class TestServiceImpl implements TestService {
	
	private static final Logger logger = Logger
			.getLogger(TestServiceImpl.class);

	public static final String url = "http://DEPARTMENT";

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="getByIdFallback")
	@Override
	public Department getById(long id) {
		logger.debug("---------------spring cloud test hystirx begin---------------");
		return restTemplate.getForObject(url+"/get/"+id, Department.class);
	}

	private Department getByIdFallback(long id) {
		logger.debug("---------------spring cloud  hystirx fallback begin---------------");
		return new Department().setId(Long.MIN_VALUE);
	}

}
