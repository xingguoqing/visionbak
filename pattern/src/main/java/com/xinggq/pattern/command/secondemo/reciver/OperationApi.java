package com.xinggq.pattern.command.secondemo.reciver;

/**
 * @author xinggq
 * @date 2019-07-12 10:52
 * @description 运算接口
 */
public interface OperationApi {

  /**
   * 获取计算完成后的结果
   *
   * @return 计算完成后的结果
   */
  int getResult();

  /**
   * 设置计算开始的初始值
   *
   * @param result 计算开始的初始值
   */
  void setResult(int result);

  /**
   * 执行加法
   *
   * @param num 需要加的数
   */
  void add(int num);

  /**
   * 执行减法
   *
   * @param num 需要减的数
   */
  void substract(int num);

}
