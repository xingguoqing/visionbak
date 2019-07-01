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
  String CUSTOMERNAME_NOT_EMPTY = "1030";
  /**
   * 客户id不能为空
   */
  String CUSTOMERID_ISNOT_EMPTY = "1031";
  /**
   * 未找到关联客户信息
   */
  String CUSTOMERID_NOT_EXIST = "1032";
  /**
   * 分页起始页码不合法
   */
  String PAGENUM_LEGAL = "1040";
  /**
   * 分页每页数据量不合法
   */
  String PAGESIZE_LEGAL = "1041";
  /**
   * 企业id不能为空
   */
  String COMPANYID_ISNOT_EMPTY = "1060";
  /**
   * 企业名称不能为空
   */
  String COMPANYNAME_ISNOT_EMPTY = "1061";
  /**
   * 当前企业被多个客户占用，不允许修改
   */
  String COMPANY_UNABLE_CHANGE = "1062";
  /**
   * 企业信息不存在
   */
  String COMPANY_NOT_EXIST = "1063";
  /**
   * 保险类型不合法
   */
  String INSURANCE_TYPE_LEGAL = "1070";
  /**
   * 保险信息不存在
   */
  String INSURANCE_NOT_EXIST = "1071";
  /**
   * 贷款信息不存在
   */
  String LOAN_NOT_EXIST = "1080";
  /**
   * 贷款类型不合法
   */
  String LOAN_TYPE_LEGAL = "1081";
  /**
   * 请求数据转换失败
   */
  String REQUEST_PARSE_LEGAL = "9997";
  /**
   * 权限不合法
   */
  String AUTH_LEGAL = "9998";
  /**
   * 系统异常
   */
  String SYSTEM_ERROR = "9999";

}
