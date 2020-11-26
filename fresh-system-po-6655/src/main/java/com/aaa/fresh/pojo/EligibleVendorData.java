package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EligibleVendorData {

  private String id;
  private String name;
  private String vendor;
  private String buyer;
  private Date createTime;
  private Integer version;


}
