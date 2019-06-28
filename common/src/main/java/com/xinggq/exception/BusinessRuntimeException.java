/**
 *
 */
package com.xinggq.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangweir
 */
@Getter
@Setter
public class BusinessRuntimeException extends RuntimeException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * 错误编码
   */
  private String code;


  public BusinessRuntimeException(String code, String msg) {
    super(msg);
    this.code = code;
  }

  public BusinessRuntimeException(String code, String msg, Throwable cause) {
    super(msg, cause);
    this.code = code;
  }

  public BusinessRuntimeException(String message) {
    super(message);
  }

  public BusinessRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }


}
