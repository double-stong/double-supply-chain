package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 计量单位
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeasureUnitData {

  private String id;
  private String name;
  private String code;
  private String platform;
  private Integer version;

}
