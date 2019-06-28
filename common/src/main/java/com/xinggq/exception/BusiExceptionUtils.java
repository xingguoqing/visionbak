package com.xinggq.exception;


import com.xinggq.response.ResponseCode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 不依赖iuap相关类的异常处理工具类
 *
 * @author gaotx
 */
public class BusiExceptionUtils {

  private BusiExceptionUtils() {
  }

  private static Logger logger = LoggerFactory.getLogger(BusiExceptionUtils.class);

  /**
   * 抛出业务异常信息
   */
  public static void wrapBusiException(String errorCode,String desc) {
    ResponseCode responseCode = ResponseCode.getByCode(errorCode);
    logger.error(buildErrorMsg(responseCode,desc));
    throw new BusinessRuntimeException(responseCode.getCode(), responseCode.getValue());
  }

  public static void wrapBusiException(String errorCode) {
    ResponseCode responseCode = ResponseCode.getByCode(errorCode);
    logger.error(buildErrorMsg(responseCode,null));
    throw new BusinessRuntimeException(responseCode.getCode(), responseCode.getValue());
  }

  private static String buildErrorMsg(ResponseCode responseCode,String desc){
    return String.format("【%s:%s】,%s",responseCode.getCode(),responseCode.getValue(), StringUtils.isEmpty(desc)?"":desc);
  }
//  /**
//   * 异常拆箱
//   */
//  public static Throwable unmarsh(Throwable ex) {
//    Throwable cause = ex.getCause();
//    if (cause != null) {
//      cause = unmarsh(cause);
//    } else {
//      cause = ex;
//    }
//    return cause;
//  }

//  /**
//   * 创装BusinessRuntimeException
//   */
//  public static void marshException(Exception e) {
//    marshException(ICommonResponse.FAIL_CODE, e.getMessage(), e);
//  }

//  /**
//   * 创装BusinessRuntimeException
//   */
//  public static void marshException(String code, String msg, Exception e) {
//    Throwable cause = unmarsh(e);
//    logger.error(cause.getMessage(), cause);
//    if (cause instanceof BusinessRuntimeException) {
//      throw (BusinessRuntimeException) cause;
//    }
//
//    throw new BusinessRuntimeException(code, msg, e);
//  }

//  public static <T> CommonResponse2<T> responseException2(Exception e, String msg) {
//    Throwable cause = unmarsh(e);
//    logger.error(msg + ":" + cause.getMessage(), cause);
//    if (cause instanceof BusinessRuntimeException) {
//      BusinessRuntimeException be = (BusinessRuntimeException) cause;
//      if (StringUtils.isEmpty(be.getCode())) {
//        return new CommonResponse2<>(ICommonResponse.FAIL_CODE, be.getMessage());
//      }
//      return new CommonResponse2<>(be.getCode(), be.getMessage());
//    }
//    String completeMsg = msg;
//    String requestId = MDC.get(Constants.REQUEST_ID_KEY);
//    if(StringUtils.isNotEmpty(requestId)){
//      completeMsg = msg + "[requestId:" + requestId + "]";
//    }
//    return new CommonResponse2<>(ICommonResponse.FAIL_CODE, completeMsg);
//  }

//  /**
//   * 如果e是businessException，返回业务异常信息，否则按照msg返回错误信息，并在后台打印log
//   */
//  public static ICommonResponse responseException(Throwable e, String msg) {
//    Throwable cause = unmarsh(e);
//    logger.error(msg + ":" + cause.getMessage(), cause);
//    if (cause instanceof BusinessRuntimeException) {
//      BusinessRuntimeException be = (BusinessRuntimeException) cause;
//      if (StringUtils.isEmpty(be.getCode())) {
//        return new CommonResponse(ICommonResponse.FAIL_CODE, be.getMessage());
//      }
//      return new CommonResponse(be.getCode(), be.getMessage());
//    }
//    String completeMsg = msg;
//    String requestId = MDC.get(Constants.REQUEST_ID_KEY);
//    if(StringUtils.isNotEmpty(requestId)){
//      completeMsg = msg + "[requestId:" + requestId + "]";
//    }
//    return new CommonResponse(ICommonResponse.FAIL_CODE, completeMsg);
//  }



}
