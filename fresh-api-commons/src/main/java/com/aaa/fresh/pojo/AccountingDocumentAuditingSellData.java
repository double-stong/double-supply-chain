package com.aaa.fresh.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * accounting_document_auditing_sell_data
 * @author  进账审核表
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountingDocumentAuditingSellData implements Serializable {
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
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")// 后台传数据到前台
    private Date makeDate;

    /**
     * 销售订单外键
     */
    private String soid;

    /**
     * 版本
     */
    private Integer version;

    private static final long serialVersionUID = 1L;
}