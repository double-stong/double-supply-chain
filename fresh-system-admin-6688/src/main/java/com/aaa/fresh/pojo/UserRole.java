package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {

  private Integer userRoleId;
  private Integer userId;
  private Integer roleId;
  private Integer userRoleState;

}
