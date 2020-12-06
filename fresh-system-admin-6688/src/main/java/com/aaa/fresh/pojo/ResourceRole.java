package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceRole {

  private Integer resourceRoleId;
  private Integer roleId;
  private Integer resourcesId;
  private Integer state;

}
