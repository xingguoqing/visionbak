package com.xinggq.customer.controller;

import com.github.pagehelper.PageInfo;
import com.xinggq.customer.dto.PageQueryDto;
import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.service.ICustomerService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.AbstractResponse;
import com.xinggq.response.ICommonCode;
import com.xinggq.response.ResponseCode;
import java.util.Arrays;
import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xinggq.response.ICommonResponse;

/**
 * @author xinggq
 * @date 2019-06-25 17:26
 * @description
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {


  @Autowired
  private ICustomerService customerService;


  @PostMapping("/page_query")
  public ICommonResponse selecByPage(@Valid @RequestBody PageQueryDto dto) {

    Integer pageNum = dto.getPageNum();
    Integer pageSize = dto.getPageSize();
    PageInfo<Customer> customers = customerService.selecByPage(pageNum, pageSize);
    return AbstractResponse.getSuccessResp(customers);
  }

  @PostMapping("/add")
  public ICommonResponse add(@Valid @RequestBody Customer customer) {
    customerService.add(Arrays.asList(customer));
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }

  @PostMapping("/update_by_id")
  public ICommonResponse updateById(@Valid @RequestBody Customer customer) {
    if(StringUtils.isEmpty(customer.getId())){
      BusiExceptionUtils.wrapBusiException(ICommonCode.CUSTOMERID_ISNOT_EMPTY);
    }
    customerService.updateById(customer);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }

  @PostMapping("/delete")
  public ICommonResponse delete(@Valid @RequestBody List<String> customerIds) {
    customerService.deleteByIds(customerIds);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }

}
