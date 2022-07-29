package com.jeonghyeon.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Springboot2WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2WebserviceApplication.class, args);
    }

}
