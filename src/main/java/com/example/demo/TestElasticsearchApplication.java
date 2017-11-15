package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by sunzhenzhou on 2017/11/15.
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.example.demo")
@Configuration
public class TestElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestElasticsearchApplication.class, args);
    }
}
