package com.example.kapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KapidemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KapidemoApplication.class, args);
    }

}

