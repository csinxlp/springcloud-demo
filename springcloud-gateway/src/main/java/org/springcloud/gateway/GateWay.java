package org.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author  chenxinming
 */
@SpringCloudApplication
@EnableZuulProxy //开启当前项目为spring cloud zuul项目
public class GateWay {

    public static void main(String[] args) {
            SpringApplication.run(GateWay.class,args);
    }
}
