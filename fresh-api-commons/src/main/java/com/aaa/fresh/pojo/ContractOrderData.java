package com.aaa.fresh.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * contract_order_data
 * @author 
 */
@Data
public class ContractOrderData implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 买⽅
     */
    private String buyer;

    /**
     * 卖⽅
     */
    private String seller;

    /**
     * 运营状态
     */
    private String status;

    /**
     * 总⾦额
     */
    private BigDecimal totalAmount;

    /**
     * 合同
     */
    private String contract;

    /**
     * 创建于
     */
    private Date createTime;

    /**
     * 更新于
     */
    private Date lastUpdateTime;

    /**
     * 平台
     */
    private String platform;

    /**
     * 版本
     */
    private Integer version;

    private static final long serialVersionUID = 1L;
}