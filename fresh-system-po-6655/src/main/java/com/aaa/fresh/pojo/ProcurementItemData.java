package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcurementItemData {

  private String id;
  private String name;
  private String product;
  private Integer quatity;
  private String procurementRequirement;
  private String status;
  private Integer version;
  private String eid;
  private Integer page; //页码
  private Integer size; //大小

}
