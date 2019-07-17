package com.xinggq.pattern.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinggq
 * @date 2019-07-12 13:57
 * @description 测试数据
 */
public class TempDB {

  private TempDB() {
  }

  public static Map<String,Double> mapMonthSaleMoney = new HashMap<>();

  static{
    mapMonthSaleMoney.put("张三",10000.0);
    mapMonthSaleMoney.put("李四",20000.0);
    mapMonthSaleMoney.put("王五",30000.0);
  }
}
