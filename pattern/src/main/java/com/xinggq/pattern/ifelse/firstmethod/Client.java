package com.xinggq.pattern.ifelse.firstmethod;


/**
 * @author xinggq
 * @date 2019-08-13 22:13
 * @description
 */
public class Client {

  public int calculateUsngFactory(int a, int b, String operator) {
    Operation operation = OperatorFactory.getOperation(operator)
        .orElseThrow(() -> new IllegalArgumentException("不合法的运算符"));
    return operation.calculate(a, b);
  }

  public static void main(String[] args) {
    Client client = new Client();
    System.out.println(client.calculateUsngFactory(1, 2, "add"));
    System.out.println(client.calculateUsngFactory(1, 2, "subtract"));
    System.out.println(client.calculateUsngFactory(1, 2, "divide"));
  }

}
