package com.aaa.fresh.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * eligible_vendor_data
 * @author 
 */
@Data
public class EligibleVendorData implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 供应商
     */
    private String vendor;

    /**
     * 买方
     */
    private String buyer;

    /**
     * 创建于
     */
    private Date createTime;

    /**
     * 版本
     */
    private Integer version;

    private Integer page; //页码
    private Integer size; //大小

    private static final long serialVersionUID = 1L;
}