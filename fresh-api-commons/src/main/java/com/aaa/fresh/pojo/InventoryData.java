package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 库存管理
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryData {

  private String id;
  private Integer quantity;
  private String product;
  private String stockLotNumber;
  private String warehouse;
  private String merchant;
  private Date createTime;
  private Date lastUpdateTime;
  private Integer version;
  private String productId;
  private String warehouseId;

  //添加分页
  private Integer page;
  private Integer size;
}
