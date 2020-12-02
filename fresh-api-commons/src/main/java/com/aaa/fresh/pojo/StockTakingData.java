package com.aaa.fresh.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
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
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date stockTakingTime;
  private String operator;
  private String stockTakingStatus;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date lastUpdateTime;
  private String owner;
  private Integer version;

  private Integer page;
  private Integer size;
}
