package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.TakeStockMapper;
import com.aaa.fresh.pojo.StockTakingRecordData;
import com.aaa.fresh.service.TakeStockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TakeStockServiceImpl implements TakeStockService {

    @Resource
    private TakeStockMapper takeStockService;

    @Override
    public Long getTotal(StockTakingRecordData stockTakingRecordData) {
        return takeStockService.getTotal(stockTakingRecordData);
    }

    @Override
    public List<StockTakingRecordData> selAllTakeStock(StockTakingRecordData stockTakingRecordData) {
        return takeStockService.selAllTakeStock(stockTakingRecordData);
    }

    @Override
    public int addTakeStock(StockTakingRecordData stockTakingRecordData) {
        return takeStockService.addTakeStock(stockTakingRecordData);
    }

    @Override
    public int updTakeStock(StockTakingRecordData stockTakingRecordData) {
        return takeStockService.updTakeStock(stockTakingRecordData);
    }

    @Override
    public int deleteTakeStock(String Id) {
        return takeStockService.deleteTakeStock(Id);
    }

    @Override
    public StockTakingRecordData selOneTakeStock(String Id) {
        return takeStockService.selOneTakeStock(Id);
    }
}
