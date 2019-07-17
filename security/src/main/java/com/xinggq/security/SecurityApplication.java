package com.xinggq.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xinggq
 * @date 2019-07-01 09:32
 * @description
 */
@SpringBootApplication
@EnableFeignClients("com.xinggq.customerapi.api")
public class SecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run(SecurityApplication.class, args);
  }
}
