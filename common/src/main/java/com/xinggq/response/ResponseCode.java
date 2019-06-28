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
  USERNAME_NOT_EMPTY("1030","客户名称不能为空"),
  /**
   * 分页起始页码不合法
   */
  PAGENUM_LEGAL("1040","分页起始页码不合法"),
  /**
   * 分页每页数据量不合法
   */
  PAGESIZE_LEGAL("1041","分页每页数据量不合法"),
  /**
   * 请求方法不正确
   */
  HTTP_METHOD_NOT_SUPPORT("9001", "请求方法不正确"),
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
