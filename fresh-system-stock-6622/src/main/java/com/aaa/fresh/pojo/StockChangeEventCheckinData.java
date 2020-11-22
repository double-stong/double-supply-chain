package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 库存变化事件检⼊表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockChangeEventCheckinData {

  private String id;
  private String name;
  private String changeRequest;
  private Date createTime;
  private String stockChange;
  private Integer version;




}
