package com.aaa.fresh.service;

import com.aaa.fresh.pojo.ProcurementItemData;

import java.util.List;
public interface ProcurementItemDataService {
    /*采购订单 项目*/

    //查询总条数
    Long allTotal(ProcurementItemData procurementItemData);
    /*查全部*/
    List<ProcurementItemData> selectAll(ProcurementItemData procurementItemData);
    /*添加*/
    int insert (List<ProcurementItemData> list);
    /*修改*/
    int update(ProcurementItemData procurementItemData);
}
