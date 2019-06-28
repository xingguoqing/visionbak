package com.xinggq.response;

import lombok.Getter;

/**
 * @author xinggq
 * @date 2019-06-25 21:04
 * @description
 */
@Getter
public class AbstractResponse<D> implements ICommonResponse {

  private String code;

  private String name;

  private D data;

  public AbstractResponse(){

  }

  public AbstractResponse(ResponseCode responseCode) {
    this(responseCode,null);
  }

  public AbstractResponse(ResponseCode responseCode, D data) {
    this.code = responseCode.getCode();
    this.name = responseCode.getValue();
    this.data = data;
  }

  public static <D> AbstractResponse getSuccessResp(D data) {
    return new AbstractResponse(ResponseCode.SUCCESS, data);
  }

  @Override
  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public void setMsg(String msg) {
    this.name = msg;
  }
}
