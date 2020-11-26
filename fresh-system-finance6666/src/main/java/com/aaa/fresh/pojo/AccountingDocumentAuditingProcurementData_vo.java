package com.aaa.fresh.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * accounting_document_auditing_procurement_data
 * @author   查询所有 采购审核表
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountingDocumentAuditingProcurementData_vo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 审核人
     */
    private String who;

    /**
     * 评论
     */
    private String comments;

    /**
     * 审核日期
     */
    private Date makeDate;

    /**
     * 采购订单外键
     */
    private String poid;

    /**
     * 版本
     */
    private Integer version;

    private ProcurementRequirementData prd;//采购订单信息

    private Integer page; //页码
    private Integer size; //大小
}