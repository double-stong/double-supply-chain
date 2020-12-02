package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * account_bank_sell_info_data
 * @author  所有入账详细信息 实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountBankSellInfoData_vo implements Serializable {
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
     * 销售订单外键
     */
    private String soid;

    /**
     * 版本
     */
    private Integer version;

    //银行状态 钱
    private AccountBankData abd;
    //销售订单详细信息

    //入账审核详细信息
    AccountingDocumentAuditingSellData adasd;

    private Integer page; //页码
    private Integer limit; //条数

}