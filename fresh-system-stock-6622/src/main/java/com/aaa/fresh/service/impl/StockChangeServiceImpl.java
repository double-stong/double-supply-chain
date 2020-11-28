package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.StockChangeMapper;
import com.aaa.fresh.pojo.StockChangeData;
import com.aaa.fresh.pojo.StockChangeDirectionData;
import com.aaa.fresh.pojo.StockChangeTypeData;
import com.aaa.fresh.service.StockChangeService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockChangeServiceImpl implements StockChangeService {

    @Resource
    private StockChangeMapper mapper;

    @Override
    public Long getTotal(StockChangeData stockChangeData) {
        return mapper.getTotal(stockChangeData);
    }

    @Override
    public List<StockChangeData> selAllStockChange(StockChangeData stockChangeData) {
        return mapper.selAllStockChange(stockChangeData);
    }

    @Override
    public StockChangeData selOneStockChange(String Id) {
        return mapper.selOneStockChange(Id);
    }

    @Override
    public int addStockChange(StockChangeData stockChangeData) {
        return mapper.addStockChange(stockChangeData);
    }

    @Override
    public int delStockChange(String Id) {
        return mapper.delStockChange(Id);
    }

    @Override
    public int updStockChange(StockChangeData stockChangeData) {
        return mapper.updStockChange(stockChangeData);
    }

    @Override
    public List<StockChangeDirectionData> selAllDirectinon() {
        return mapper.selAllDirectinon();
    }

    @Override
    public List<StockChangeTypeData> selAllChangeType() {
        return mapper.selAllChangeType();
    }
}
