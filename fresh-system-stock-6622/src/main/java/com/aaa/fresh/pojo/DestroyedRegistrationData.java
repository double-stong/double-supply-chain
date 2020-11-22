package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 损耗登记表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestroyedRegistrationData {

  private String id;
  private String name;
  private String product;
  private double quantity;
  private double destroyedValue;
  private String registrationComment;
  private Date registeredTime;
  private String warehouse;
  private String merchant;
  private String booker;
  private Integer version;

  private Integer page;
  private Integer size;
}
