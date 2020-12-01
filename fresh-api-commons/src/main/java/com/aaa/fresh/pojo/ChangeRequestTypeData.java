package com.aaa.fresh.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 请求类型表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeRequestTypeData {
  private String id;
  private String name;
  private String code;
  private String icon;
  private Integer displayOrder;
  private String bindTypes;
  private String stepConfiguration;
  private String platform;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;
  private Integer version;


}
