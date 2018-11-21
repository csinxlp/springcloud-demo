package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * eureka消费者
 * @author  chenxinming
 */
@EnableFeignClients //开启feign 功能
@EnableCircuitBreaker // hystirx注解开启断路器功能
@EnableDiscoveryClient // 注册到eureka消费
@SpringBootApplication
public class DepartmentConsumer {
    public static void main(String[] args) {
          SpringApplication.run(DepartmentConsumer.class,args);
    }
}
