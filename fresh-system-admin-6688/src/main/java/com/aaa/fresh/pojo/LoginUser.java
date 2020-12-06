package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser {

  private Integer userId;
  private String loginName;
  private String loginPwd;
  private String userRealName;
  private Integer userState;
  private String userPic;


  private Integer page;
  private Integer size;

}
