package com.xinggq.config;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.xinggq.exception.BusinessRuntimeException;
import com.xinggq.response.AbstractResponse;
import com.xinggq.response.ICommonResponse;
import com.xinggq.response.ResponseCode;
import com.xinggq.utils.Constants;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常处理
 *
 * @author 刘研
 * @create 2017-12-27 14:12
 **/
@ControllerAdvice
@Component
public class GlobalExceptionHandler {

  public Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler(value = Exception.class)
  public void exceptionHandler(HttpServletRequest request, HttpServletResponse response,
      Exception ex) throws IOException {
    logger.error(ex.getMessage(), ex);
    ICommonResponse resp = new AbstractResponse(ResponseCode.SYSTEM_ERROR);
    if (ex instanceof BusinessRuntimeException) {
      if (!Strings.isNullOrEmpty(((BusinessRuntimeException) ex).getCode())) {
        String errcode =  ((BusinessRuntimeException) ex).getCode();
        resp.setCode(errcode);
        resp.setMsg(ResponseCode.getByCode(errcode).getValue());
      }
    } else if (ex instanceof HttpRequestMethodNotSupportedException) {
      response.setStatus(HttpStatus.METHOD_NOT_ALLOWED.value());
      resp.setCode(ResponseCode.HTTP_METHOD_NOT_SUPPORT.getCode());
      resp.setMsg(ResponseCode.HTTP_METHOD_NOT_SUPPORT.getValue());
    } else if (ex instanceof IllegalArgumentException) {
      resp.setCode(ResponseCode.ILLEGAL_PARAMETERS.getCode());
      resp.setMsg(ResponseCode.ILLEGAL_PARAMETERS.getValue());
    }else if(ex instanceof MethodArgumentNotValidException){
      //只取第一个校验错误
      ObjectError error = ((MethodArgumentNotValidException) ex).getBindingResult().getAllErrors().get(0);
      String code = error.getDefaultMessage();
      resp.setCode(code);
      resp.setMsg(ResponseCode.getByCode(code).getValue());
    } else {
      String errMsg = "系统发生异常错误，请联系管理员查看日志";
      String requestId = MDC.get(Constants.REQUEST_ID_KEY);
      if (!StringUtils.isEmpty(requestId)) {
        errMsg = errMsg + "[requestId:" + requestId + "]";
      }
      resp.setMsg(errMsg);
    }
    response.setContentType("application/json;charset=UTF-8");
    logger.info(JSON.toJSONString(resp));
    byte[] bytes = JSON.toJSONBytes(resp);
    response.getOutputStream().write(bytes);
  }

//  @ExceptionHandler({MethodArgumentNotValidException.class, BindException.class})
//  public ResponseEntity<ICommonResponse> handlerValidatorException(
//      Exception ex) {
//    logger.error(ex.getMessage(), ex);
//    BindingResult bindingResult = null;
//    if (ex instanceof MethodArgumentNotValidException) {
//      bindingResult = ((MethodArgumentNotValidException) ex).getBindingResult();
//    }
//    if (ex instanceof BindException) {
//      bindingResult = ((BindException) ex).getBindingResult();
//    }
//    if (bindingResult == null) {
//      return new ResponseEntity<>(new AbstractResponse(ResponseCode.ILLEGAL_PARAMETERS),
//          HttpStatus.OK);
//    }
//    String errorMsg = bindingResult.getAllErrors().stream()
//        .map(ObjectError::getDefaultMessage).collect(
//            Collectors.joining(";"));
//    return new ResponseEntity<>(new AbstractResponse(ResponseCode.ILLEGAL_PARAMETERS),
//        HttpStatus.OK);
//  }

  /**
   * 记录数据转换错误； <li>JSON转换错误</>
   */
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(HttpMessageNotReadableException.class)
  public void handleMessageNotReadableException(HttpServletRequest request,
      HttpMessageNotReadableException exception) {
    logger.error("请求{}报错，数据格式转换失败。错误明细:\n{}", request.getRequestURI(), exception.getMessage(),
        exception);
  }
}
