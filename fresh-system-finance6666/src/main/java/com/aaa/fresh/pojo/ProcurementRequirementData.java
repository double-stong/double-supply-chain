package com.aaa.fresh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcurementRequirementData {

  private String id;
  private String name;
  private String buyer;
  private String requirementStatus;
  private Date createTime;
  private Date endTime;
  private String approvalstatus;
  private Integer version;


}
