package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka消费者
 * @author  chenxinming
 */
@EnableCircuitBreaker // hystirx注解开启断路器功能
@EnableDiscoveryClient // 注册到eureka消费
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DepartmentConsumer {
    public static void main(String[] args) {
          SpringApplication.run(DepartmentConsumer.class,args);
    }
}
