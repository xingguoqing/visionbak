package com.xinggq.mq.test;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.xinggq.mq.config.RabbitmqConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xinggq
 * @date 2019-07-05 13:37
 * @description
 */
@Component
public class RabbitConnection {

  @Autowired
  private RabbitmqConfig rabbitmqConfig;

  /**
   * 创建rabbitmq连接
   * @return
   */
  public Connection GetRabbitConnection() {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setUsername(rabbitmqConfig.getUserName());
    factory.setPassword(rabbitmqConfig.getPassword());
    factory.setVirtualHost(rabbitmqConfig.getVHost());
    factory.setHost(rabbitmqConfig.getHost());
    factory.setPort(rabbitmqConfig.getPort());
    Connection conn = null;
    try {
      conn = factory.newConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }

}
