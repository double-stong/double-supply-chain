package com.aaa.fresh.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * account_bank_data
 * @author   银行账户表
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountBankData implements Serializable {
    private String id;

    /**
     * 开户银行
     */
    private String openingBank;

    /**
     * 账户号码
     */
    private String accountNumber;

    /**
     * 资产
     */
    private String property;

    /**
     * 版本
     */
    private Integer version;

    private static final long serialVersionUID = 1L;
}