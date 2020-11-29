package com.aaa.fresh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcurementRequirementDataVo {
    private ProcurementRequirementData pro;
//    private String id;
//    private String name;
//    private String buyer;
//    private String requirementStatus;
//    private Date createTime;
//    private Date endTime;
//
//    private Double totalprice;
//    private String approvalstatus;
//    private Integer version;
    private List<ProcurementItemData> items;

    private Integer page; //页码
    private Integer size; //大小
}
