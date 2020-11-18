package com.aaa.fresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class RatifyMainRun6633 {
    public static void main(String[] args) {
        SpringApplication.run(RatifyMainRun6633.class,args);
    }
}
