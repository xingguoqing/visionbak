package com.xinggq.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xinggq
 * @date 2019-07-09 10:43
 *
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {


  public static void main(String[] args) {
    SpringApplication.run(EurekaApplication.class, args);
  }
}
