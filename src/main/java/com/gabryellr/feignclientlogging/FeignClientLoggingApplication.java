package com.gabryellr.feignclientlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientLoggingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientLoggingApplication.class, args);
    }

}
