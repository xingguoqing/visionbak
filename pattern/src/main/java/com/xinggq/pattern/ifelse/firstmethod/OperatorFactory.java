package com.xinggq.pattern.ifelse.firstmethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author xinggq
 * @date 2019-08-13 22:10
 * @description 工厂类
 */
public class OperatorFactory {

  private static Map<String, Operation> operatorMap = new HashMap<>();

  static{
    operatorMap.put("add",new AddOperation());
    operatorMap.put("subtract",new SubtractOperation());
  }

  public static Optional<Operation> getOperation(String operation){
    return Optional.ofNullable(operatorMap.get(operation));
    /**
     * of方法不允许参数是null，否则就会npe
     * 但是OfNullable则没有限制
     */
//    return Optional.of(operatorMap.get(operation));
  }

}
