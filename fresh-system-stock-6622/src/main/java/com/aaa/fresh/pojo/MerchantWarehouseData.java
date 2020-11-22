package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 仓库管理
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantWarehouseData {

  private String id;
  private String name;
  private String address;
  private String merchant;
  private Date createTime;
  private Date lastUpdateTime;
  private Integer version;
  private Integer page; //页码
  private Integer size; //大小
}
