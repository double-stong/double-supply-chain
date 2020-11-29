package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 库存变化项⽬表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockChangeItemData {

  private String id;
  private String name;
  private String product;
  private String stockLotNumber;
  private Double quantity;
  private String stockCheckIn;
  private Integer version;


}
