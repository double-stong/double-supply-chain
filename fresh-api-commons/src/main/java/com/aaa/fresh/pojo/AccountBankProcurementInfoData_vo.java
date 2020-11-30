package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/*
*       查询所有采购转账消费详细信息 实体类
* */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountBankProcurementInfoData_vo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private String id;

    /**
     * 更改日期
     */
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

    private AccountBankData abd;//银行状态 钱

    private ProcurementRequirementData prd;////采购订单信息

    private AccountingDocumentAuditingProcurementData adapd;//采购审核详细信息

    private Integer page; //页码
    private Integer limit; //条数
}
