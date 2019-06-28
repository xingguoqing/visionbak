package com.xinggq.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xinggq
 * @date 2019-06-25 15:18
 * @description
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xinggq")
@PropertySource(value = {"classpath:jdbc.properties"})
public class CustomerApplication {
  public static void main(String[] args) {
    SpringApplication.run(CustomerApplication.class, args);
  }
}

