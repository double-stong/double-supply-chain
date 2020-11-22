package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockTakingRecordData {

  private String id;
  private String name;
  private String produce;
  private String stockLotNumber;
  private String measureUnit;
  private String inventory;
  private Integer inventoryQuantity;
  private Integer stockTakingQuantity;
  private Integer stockTakingDiff;
  private String stockTakingResult;
  private String operator;
  private String comment;
  private Date createTime;
  private String stockTaking;
  private Integer version;

  private Integer page;
  private Integer size;

}
