package com.aaa.fresh.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
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
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date   createTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date   endTime;

  private Double totalprice;
  private String approvalstatus;
  private Integer version;

  private Integer page; //页码
  private Integer size; //大小


}
