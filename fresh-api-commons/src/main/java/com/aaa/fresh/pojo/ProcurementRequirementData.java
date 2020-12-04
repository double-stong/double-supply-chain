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
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")// 后台传数据到前台
  private Date   createTime;
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")// 后台传数据到前台
  private Date   endTime;

  private Double totalprice;
  private String approvalstatus;
  private Integer version;

  private Integer page; //页码
  private Integer limit; //大小


}
