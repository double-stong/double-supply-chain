package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.MeasureUnitData;
import com.aaa.fresh.pojo.MerchantWarehouseData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 仓库信息
 */
@Mapper
@Component
public interface StockMapper {
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
    //删除仓库之前判断仓库中是否还有货物

    //提交审批，审批完成；直接删除；

    //查询计量单位
    List<MeasureUnitData> selMeasure();



}
