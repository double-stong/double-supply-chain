package com.aaa.fresh.service;

import com.aaa.fresh.pojo.StockChangeData;
import com.aaa.fresh.pojo.StockChangeDirectionData;
import com.aaa.fresh.pojo.StockChangeTypeData;

import java.util.List;

public interface StockChangeService {
    /*===========================库存变化===========================*/
    //分页查询
    Long getTotal(StockChangeData stockChangeData);
    //查询所有的
    List<StockChangeData> selAllStockChange(StockChangeData stockChangeData);
    //查询单个
    StockChangeData selOneStockChange(String Id);
    //添加
    int addStockChange(StockChangeData stockChangeData);
    //删除
    int delStockChange(String Id);
    //修改
    int updStockChange(StockChangeData stockChangeData);
    //查询库存变化的方向  入库、、出库
    List<StockChangeDirectionData> selAllDirectinon();
    //库存变化类型  盘点入库  报废入库  退货入库
    List<StockChangeTypeData> selAllChangeType();
}
