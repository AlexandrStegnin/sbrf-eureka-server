package com.stegnin.sbrfeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SbrfEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbrfEurekaServerApplication.class, args);
    }

}
