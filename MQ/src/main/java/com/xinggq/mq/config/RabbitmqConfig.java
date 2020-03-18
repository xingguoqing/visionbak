package com.xinggq.mq.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xinggq
 * @date 2020/3/17 16:26
 * @description mq配置类
 */
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitmqConfig {

  private  String userName ;
  private  String password ;
  private  String vHost ;
  private  String host ;
  private  int port ;

}
