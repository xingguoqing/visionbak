package com.xinggq.response;


import com.xinggq.exception.BusiExceptionUtils;
import lombok.Getter;

/**
 * @author xinggq
 * @date 2019-06-25 19:54
 * @description
 */
@Getter
public enum ResponseCode {


  /**
   * 操作成功
   */
  SUCCESS("0000", "操作成功"),
  /**
   * 参数非法
   */
  ILLEGAL_PARAMETERS("1001", "参数非法"),
  /**
   * 手机号不能为空
   */
  PHONE_NOT_EMPTY("1010","手机号不能为空"),
  /**
   * 手机号格式不合法
   */
  PHONE_NOT_LEGAL("1011","手机号格式不合法"),
  /**
   * 性别不能为空
   */
  SEX_NOT_EMPTY("1020","性别不能为空"),
  /**
   * 性别不合法
   */
  SEX_NOT_LEGAL("1021","性别不合法"),
  /**
   * 客户名称不能为空
   */
  CUSTOMERNAME_NOT_EMPTY("1030","客户名称不能为空"),
  /**
   * 客户id不能为空
   */
  CUSTOMERID_ISNOT_EMPTY("1031","客户id不能为空"),
  /**
   * 未找到关联客户信息
   */
  CUSTOMERID_NOT_EXIST("1032","未找到关联客户信息"),
  /**
   * 分页起始页码不合法
   */
  PAGENUM_LEGAL("1040","分页起始页码不合法"),
  /**
   * 分页每页数据量不合法
   */
  PAGESIZE_LEGAL("1041","分页每页数据量不合法"),
  /**
   * 用户id不能为空
   */
  USERID_ISNOT_EMPTY("1050","用户id不能为空"),

  /**
   * 企业id不能为空
   */
  COMPANYID_ISNOT_EMPTY("1060","企业id不能为空"),
  /**
   * 企业名称不能为空
   */
  COMPANYNAME_ISNOT_EMPTY("1061","企业名称不能为空"),
  /**
   * 当前企业被多个客户占用，不允许修改
   */
  COMPANY_UNABLE_CHANGE("1062","当前企业被多个客户占用，不允许修改"),
  /**
   * 企业信息不存在
   */
  COMPANY_NOT_EXIST("1063","企业信息不存在"),
  /**
   * 请求方法不正确
   */
  HTTP_METHOD_NOT_SUPPORT("9001", "请求方法不正确"),
  /**
   * 请求数据转换失败
   */
  REQUEST_PARSE_LEGAL("9997", "请求数据转换失败"),
  /**
   * 权限不合法
   */
  AUTH_LEGAL("9998", "权限不合法"),
  /**
   * 系统异常
   */
  SYSTEM_ERROR("9999", "系统异常");

  private String code;

  private String value;

  ResponseCode(String code, String value) {
    this.value = value;
    this.code = code;
  }

  public static ResponseCode getByCode(String code) {
    ResponseCode[] codes = ResponseCode.values();
    for (ResponseCode codeEnum : codes) {
      if(codeEnum.getCode().equals(code)){
        return codeEnum;
      }
    }
    BusiExceptionUtils.wrapBusiException(ICommonCode.SYSTEM_ERROR,"根据错误code没有找到对应错误枚举，请检查");
    return null;
  }

}
