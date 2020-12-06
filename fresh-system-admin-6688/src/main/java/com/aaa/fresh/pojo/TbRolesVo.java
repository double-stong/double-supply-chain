package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbRolesVo {

  private Integer roleId;
  private String roleName;
  private String roleDes;
  private Integer roleState;
  private String click;
  private Integer id;
  private List<TbResources> tbResourcesList;

}
