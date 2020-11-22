package com.aaa.fresh.service;

import com.aaa.fresh.pojo.MeasureUnitData;
import com.aaa.fresh.pojo.MerchantWarehouseData;

import java.util.List;

public interface StockService {
    //查询总条数
    Long getTotal(MerchantWarehouseData merchantWarehouseData);
    //查询出所有的仓库
    List<MerchantWarehouseData> selAllWarehouse(MerchantWarehouseData merchantWarehouseData);
    //添加仓库
    int addWarehouse(MerchantWarehouseData merchantWarehouseData);
    //修改仓库
    int updWarehouse(MerchantWarehouseData merchantWarehouseData);
    //删除仓库
    int delWareHouse(String Id);
    //查询单个仓库信息
    MerchantWarehouseData selOneWareHouse(String Id);


    //查询计量单位
    List<MeasureUnitData> selMeasure();
}
