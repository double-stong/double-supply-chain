package com.aaa.fresh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * accounting_document_auditing_sell_data
 * @author  所有进账审核信息 实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountingDocumentAuditingSellData_vo implements Serializable {
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

    //销售订单详细信息


    private Integer page; //页码
    private Integer limit; //条数
}