package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 实物盘点表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockTakingData {

  private String id;
  private String name;
  private String warehouse;
  private Date stockTakingTime;
  private String operator;
  private String stockTakingStatus;
  private Date createTime;
  private Date lastUpdateTime;
  private String owner;
  private Integer version;

  private Integer page;
  private Integer size;
}
