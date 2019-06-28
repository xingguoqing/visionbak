package com.xinggq.response;

/**
 *
 * @author xinggq
 * @date 2019-06-26 11:00
 * @description
 */
public interface ICommonCode {

  /**
   * 手机号不能为空
   */
  String PHONE_NOT_EMPTY = "1010";
  /**
   * 手机号格式不合法
   */
  String PHONE_NOT_LEGAL = "1011";
  /**
   * 性别不能为空
   */
  String SEX_NOT_EMPTY = "1020";
  /**
   * 性别不合法
   */
  String SEX_NOT_LEGAL = "1021";
  /**
   * 客户名称不能为空
   */
  String USERNAME_NOT_EMPTY = "1030";
  /**
   * 分页起始页码不合法
   */
  String PAGENUM_LEGAL = "1040";
  /**
   * 分页每页数据量不合法
   */
  String PAGESIZE_LEGAL = "1041";
  /**
   * 用户id不能为空
   */
  String USERID_ISNOT_EMPTY = "1050";
  /**
   * 系统异常
   */
  String SYSTEM_ERROR = "9999";

}
