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
  //单价
  private Double unitprice;
  //数量
  private Integer quatity;
  //订单号
  private String procurementRequirement;
  private String status;
  private Integer version;
  private String eid;
  private Integer page; //页码
  private Integer limit; //大小

}
