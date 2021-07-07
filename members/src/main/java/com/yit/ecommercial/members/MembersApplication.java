package com.yit.ecommercial.members;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.yit.ecommercial.members.feign")
@SpringBootApplication
public class MembersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MembersApplication.class, args);
    }

}
