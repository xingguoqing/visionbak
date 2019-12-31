package com.xinggq.pattern.ifelse.thirdmethod;

/**
 * @author xinggq
 * @date 2019-08-13 22:38
 * @description
 */
public class Client {

  public static void main(String[] args) {
    Calculation calculation = new Calculation();
    System.out.println(calculation.calcute(new AddCommand(1,2)));
    System.out.println(calculation.calcute(new SubtractCommand(1,2)));
  }

}
