package com.github.kimishima.springbootdemo.service;


import com.github.kimishima.springbootdemo.domain.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.authority.AuthorityUtils;

@Getter
@Setter
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
  private final User user;

  public LoginUserDetails(User user) {
    super(
        user.getName(),
        user.getEncodePassword(),
        AuthorityUtils.createAuthorityList("ROLE_USER")
    );
    this.user = user;
  }
}