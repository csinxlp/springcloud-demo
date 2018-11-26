package org.springcloud.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

public class DisableHystrixConfiguration {

    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }
}
