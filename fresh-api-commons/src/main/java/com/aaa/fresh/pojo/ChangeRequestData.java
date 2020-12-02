package com.aaa.fresh.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeRequestData {

  private String id;
  private String name;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;
  private String remoteIp;
  private String requestType;
  private String platform;
  private Integer version;

  private Integer page;
  private Integer size;

}
