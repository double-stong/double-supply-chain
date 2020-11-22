package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.StockRecordMapper;
import com.aaa.fresh.pojo.StockTakingData;
import com.aaa.fresh.pojo.StockTakingResultData;
import com.aaa.fresh.pojo.StockTakingStatusData;
import com.aaa.fresh.service.StockRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockRecordServiceImpl implements StockRecordService {

    @Resource
    private StockRecordMapper stockRecordMapper;

    @Override
    public Long getTotal(StockTakingData stockTakingData) {
        return stockRecordMapper.getTotal(stockTakingData);
    }

    @Override
    public List<StockTakingData> selAllStockTaking(StockTakingData stockTakingData) {
        return stockRecordMapper.selAllStockTaking(stockTakingData);
    }

    @Override
    public int addStockTaking(StockTakingData stockTakingData) {
        return stockRecordMapper.addStockTaking(stockTakingData);
    }

    @Override
    public int delStockTaking(String Id) {
        return stockRecordMapper.delStockTaking(Id);
    }

    @Override
    public StockTakingData selOneStockTaking(String Id) {
        return stockRecordMapper.selOneStockTaking(Id);
    }

    @Override
    public int updStockTaking(StockTakingData stockTakingData) {
        return stockRecordMapper.updStockTaking(stockTakingData);
    }

    @Override
    public List<StockTakingResultData> selAllStockTakingResult() {
        return stockRecordMapper.selAllStockTakingResult();
    }

    @Override
    public List<StockTakingStatusData> selStockTakingStauts() {
        return stockRecordMapper.selStockTakingStauts();
    }
}
