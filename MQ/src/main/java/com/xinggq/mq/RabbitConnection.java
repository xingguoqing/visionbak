package com.xinggq.mq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author xinggq
 * @date 2019-07-05 13:37
 * @description
 */
public class RabbitConnection {

  private static String userName = "guest";
  private static String password = "guest";
  private static String vHost = "/";
  private static String host = "104.168.165.180";
  private static int port = 5673;


  /**
   * 创建rabbitmq连接
   * @return
   */
  public static Connection GetRabbitConnection() {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setUsername(userName);
    factory.setPassword(password);
    factory.setVirtualHost(vHost);
    factory.setHost(host);
    factory.setPort(port);
    Connection conn = null;
    try {
      conn = factory.newConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }


  public static Connection GetRabbitConnection2() {
    ConnectionFactory factory = new ConnectionFactory();
    // 连接格式：amqp://userName:password@hostName:portNumber/virtualHost
    String uri = String.format("amqp://%s:%s@%s:%d%s", userName, password, host, port, vHost);
    Connection conn = null;
    try {
      factory.setUri(uri);
      factory.setVirtualHost(vHost);
      conn = factory.newConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }


}
