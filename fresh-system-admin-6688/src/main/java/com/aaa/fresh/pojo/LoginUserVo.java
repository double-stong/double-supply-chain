package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserVo {

  private Integer userId;
  private String loginName;
  private String loginPwd;
  private String userRealName;
  private Integer userState;
  private String userPic;


  private Integer roleId;
  private String roleName;
  private String roleDes;
  private Integer roleState;
  private String click;


  List<TbRoles> tbRolesList;

  private Integer page;
  private Integer size;

}
