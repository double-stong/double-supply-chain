package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceRoleVo {

  private Integer resourceRoleId;
  private Integer roleId;
  private Integer resourcesId;
  private Integer state;

}
