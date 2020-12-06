package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbResources {

  private Integer id;
  private String menuName;
  private String menuUrl;
  private Integer parentId;
  private Integer type;
  private String remark;
  private Integer state;
  private String childrenId;

  private String roleName;

  private Integer resourceRoleId;
  private Integer roleId;
  private Integer resourcesId;

}
