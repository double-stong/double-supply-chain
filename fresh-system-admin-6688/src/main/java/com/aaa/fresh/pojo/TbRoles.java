package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbRoles {

  private Integer roleId;
  private String roleName;
  private String roleDes;
  private Integer roleState;
  private String click;
  private Integer userRoleId;

}
