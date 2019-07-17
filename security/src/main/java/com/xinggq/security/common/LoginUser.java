//package com.xinggq.security.common;
//
//import com.xinggq.customerapi.entity.User;
//import java.util.Collection;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
///**
// * @author xinggq
// * @date 2019-07-09 09:58
// * @description
// */
//public class LoginUser implements UserDetails {
//
//  private User user;
//
//  public LoginUser(User user) {
//    this.user = user;
//  }
//
//
//  @Override
//  public Collection<? extends GrantedAuthority> getAuthorities() {
//    return null;
//  }
//
//  @Override
//  public String getPassword() {
//    return user.getPassword();
//  }
//
//  @Override
//  public String getUsername() {
//    return user.getPhone();
//  }
//
//  @Override
//  public boolean isAccountNonExpired() {
//    return false;
//  }
//
//  @Override
//  public boolean isAccountNonLocked() {
//    return false;
//  }
//
//  @Override
//  public boolean isCredentialsNonExpired() {
//    return false;
//  }
//
//  @Override
//  public boolean isEnabled() {
//    return false;
//  }
//}
