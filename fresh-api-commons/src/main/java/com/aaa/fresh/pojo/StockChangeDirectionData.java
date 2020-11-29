package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/***
 * 库存改变⽅向表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockChangeDirectionData {

  private String id;
  private String name;
  private String code;
  private String platform;
  private Integer version;
}
