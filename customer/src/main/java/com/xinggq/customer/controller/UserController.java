//package com.xinggq.customer.controller;
//
//import com.github.pagehelper.PageInfo;
//import com.xinggq.customer.dto.PageQueryDto;
//import com.xinggq.customer.entity.User;
//import com.xinggq.customer.service.IUserService;
//import com.xinggq.response.AbstractResponse;
//import com.xinggq.response.ResponseCode;
//import java.util.Arrays;
//import java.util.List;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.xinggq.response.ICommonResponse;
//
///**
// * @author xinggq
// * @date 2019-06-25 17:26
// * @description
// */
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//
//  @Autowired
//  private IUserService userService;
//
//
//  @PostMapping("/page_query")
//  public ICommonResponse selecByPage(@Valid @RequestBody PageQueryDto dto) {
//
//    Integer pageNum = dto.getPageNum();
//    Integer pageSize = dto.getPageSize();
//    PageInfo<User> users = userService.selecByPage(pageNum, pageSize);
//    return AbstractResponse.getSuccessResp(users);
//  }
//
//  @PostMapping("/add")
//  public ICommonResponse add(@Valid @RequestBody User user) {
//    userService.add(Arrays.asList(user));
//    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
//  }
//
//  @PostMapping("/update")
//  public ICommonResponse update(@Valid @RequestBody User user) {
//    userService.updateById(user);
//    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
//  }
//
//  @PostMapping("/delete")
//  public ICommonResponse delete(@Valid @RequestBody List<Long> usersId) {
//    userService.deleteByIds(usersId);
//    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
//  }
//
//}
