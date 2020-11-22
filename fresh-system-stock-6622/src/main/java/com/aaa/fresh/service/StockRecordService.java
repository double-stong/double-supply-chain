package com.aaa.fresh.service;

import com.aaa.fresh.pojo.StockTakingData;
import com.aaa.fresh.pojo.StockTakingResultData;
import com.aaa.fresh.pojo.StockTakingStatusData;

import java.util.List;

public interface StockRecordService {
    //查询总条数
    Long getTotal(StockTakingData stockTakingData);
    //查询所有
    List<StockTakingData> selAllStockTaking(StockTakingData stockTakingData);
    //添加
    int addStockTaking(StockTakingData stockTakingData);
    //删除
    int delStockTaking(String Id);
    //查询单个
    StockTakingData selOneStockTaking(String Id);
    //修改
    int updStockTaking(StockTakingData stockTakingData);
    //查询盘点结果表
    List<StockTakingResultData> selAllStockTakingResult();
    //查询盘点状态表
    List<StockTakingStatusData> selStockTakingStauts();
}
