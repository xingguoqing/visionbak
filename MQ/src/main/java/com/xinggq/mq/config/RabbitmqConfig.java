package com.xinggq.mq.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author xinggq
 * @date 2020/3/17 16:26
 * @description mq配置类
 */
@Setter
@Getter
@Component
//@Validated
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitmqConfig {

  private  String userName = "admin";
  private  String password = "password";
  private  String vHost = "/";
  private  String host = "192.168.220.128";
  private  int port = 5672;


}
