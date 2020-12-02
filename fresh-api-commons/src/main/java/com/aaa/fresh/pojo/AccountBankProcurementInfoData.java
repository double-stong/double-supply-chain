package com.aaa.fresh.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * account_bank_procurement_info_data
 * @author  采购转账实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountBankProcurementInfoData implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 更改日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")// 后台传数据到前台
    private Date changedate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 银行账户外键
     */
    private String bankid;

    /**
     * 采购订单外键
     */
    private String poid;

    /**
     * 版本
     */
    private Integer version;

    private static final long serialVersionUID = 1L;
}