package org.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient // 服务发现
@MapperScan(value = "org.springcloud.dao") //扫描包下所有的dao
public class DeptartmentProvider8001 {
	public static void main(String[] args) {
		SpringApplication.run(DeptartmentProvider8001.class, args);
	}
}
