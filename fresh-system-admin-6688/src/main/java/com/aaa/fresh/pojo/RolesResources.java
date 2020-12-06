package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 中间4表与三表五表的结合表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolesResources {

  private Integer roleId;
  private String roleName;
  private String roleDes;
  private Integer roleState;
  private String click;

  private Integer id;
  private String menuName;
  private String menuUrl;
  private Integer parentId;
  private Integer type;
  private String remark;
  private Integer state;
  private String childrenId;

}
