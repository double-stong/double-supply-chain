package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductData {

  private String id;
  private String name;
  private String description;
  private String origin;
  private String remark;
  private String brand;
  private String picture;
  private String measureUnit;
  private Date lastUpdateTime;
  private String merchant;
  private String platform;
  private Integer version;
  private MeasureUnitData measureUnitData;

  private Integer page;
  private Integer size;

}
