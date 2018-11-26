package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 *
 *
 *服务熔断监控
 * @author chenxinming
 *
 */
@SpringBootApplication
@EnableHystrixDashboard //开启 hystrix dashboard web监控
public class HystirxDashboard {
	public static void main(String[] args) {
		SpringApplication.run(HystirxDashboard.class, args);
	}
}
