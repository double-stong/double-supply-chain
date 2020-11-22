package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 库存变化表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockChangeData {

  private String id;
  private String name;
  private String stockChangeDirection;
  private String stockChangeType;
  private String warehouse;
  private String operator;
  private String referenceId;
  private java.util.Date checkInTime;
  private java.util.Date createTime;
  private String owner;
  private Integer version;

  private Integer page;
  private Integer size;
}
