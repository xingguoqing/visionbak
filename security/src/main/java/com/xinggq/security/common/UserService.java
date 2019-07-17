package com.xinggq.security.common;

import com.xinggq.customerapi.api.UserClient;
import com.xinggq.customerapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinggq
 * @date 2019-07-09 09:55
 * @description
 */
//@RestController
//@RequestMapping("/test")
//public class UserService implements UserDetailsService {
//
//
//  @Autowired
//  private UserClient userClient;
//
//  @GetMapping("test")
//  @Override
//  public UserDetails loadUserByUsername(@RequestParam("s") String s) throws UsernameNotFoundException {
//    //根据用户名从数据库查询对应记录
//    User user = userClient.getuserByphone(s);
//    if (user == null) {
//      throw new UsernameNotFoundException("用户不存在");
//    }
//    LoginUser loginUser = new LoginUser(user);
//    return loginUser;
//  }
//}

@RestController
@RequestMapping("/test")
public class UserService {


  @Autowired
  private UserClient userClient;

  private CommandA a;

  @GetMapping("test")
  public String loadUserByUsername(@RequestParam("s") String s){
    //根据用户名从数据库查询对应记录
    User user = userClient.getuserByphone(s);

    return null;
  }




}
