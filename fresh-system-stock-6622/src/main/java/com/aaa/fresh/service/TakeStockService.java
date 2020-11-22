package com.aaa.fresh.service;

import com.aaa.fresh.pojo.StockTakingRecordData;

import java.util.List;

public interface TakeStockService {
    //分页查询
    Long getTotal(StockTakingRecordData stockTakingRecordData);
    //查询所有
    List<StockTakingRecordData> selAllTakeStock(StockTakingRecordData stockTakingRecordData);
    //添加
    int addTakeStock(StockTakingRecordData stockTakingRecordData);
    //修改
    int updTakeStock(StockTakingRecordData stockTakingRecordData);
    //删除
    int deleteTakeStock(String Id);
    //查询单个
    StockTakingRecordData selOneTakeStock(String Id);
}
