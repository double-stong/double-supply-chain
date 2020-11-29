package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockTakingResultData {

  private String id;
  private String name;
  private String code;
  private String platform;
  private Integer version;

}
