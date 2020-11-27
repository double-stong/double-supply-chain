package com.aaa.fresh.service;

import com.aaa.fresh.pojo.ProcurementRequirementData;
import com.aaa.fresh.pojo.ProcurementRequirementDataVo;

import java.util.List;

public interface ProcurementRequirementDataService {
    //采购订单

    /*查询数据 总条数*/
    Long allTotal(ProcurementRequirementData procurementRequirementData);
    /*查全部*/
    List<ProcurementRequirementData> selectAll(ProcurementRequirementData procurementRequirementData);
    /*添加*/
    int insert (ProcurementRequirementDataVo prvo);
    /*修改*/
    int update(ProcurementRequirementData procurementRequirementData);
}
