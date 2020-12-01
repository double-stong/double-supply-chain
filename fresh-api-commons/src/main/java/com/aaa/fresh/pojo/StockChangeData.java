package com.aaa.fresh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date checkInTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;
  private String owner;
  private Integer version;

  private String productId;

  private Integer page;
  private Integer size;
}
