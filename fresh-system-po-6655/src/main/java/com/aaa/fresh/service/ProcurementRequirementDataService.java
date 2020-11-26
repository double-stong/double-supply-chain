package com.aaa.fresh.service;

import com.aaa.fresh.pojo.ProcurementRequirementData;

import java.util.List;

public interface ProcurementRequirementDataService {
    //采购订单

    /*查询数据 总条数*/
    Long allTotal(ProcurementRequirementData procurementRequirementData);
    /*查全部*/
    List<ProcurementRequirementData> selectAll(ProcurementRequirementData procurementRequirementData);
    /*添加*/
    int insert (ProcurementRequirementData procurementRequirementData);
    /*修改*/
    int update(ProcurementRequirementData procurementRequirementData);
}
