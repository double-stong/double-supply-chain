package com.aaa.fresh.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
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
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date lastUpdateTime;
  private Integer version;
  private String productId;
  private String warehouseId;
  private String measure;

  private Integer quanitys;
  private String unit;
  private Integer usable;

  //添加分页
  private Integer page;
  private Integer size;
}
