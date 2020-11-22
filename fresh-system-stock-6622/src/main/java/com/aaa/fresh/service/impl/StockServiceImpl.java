package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.StockMapper;
import com.aaa.fresh.pojo.MeasureUnitData;
import com.aaa.fresh.pojo.MerchantWarehouseData;
import com.aaa.fresh.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockMapper stockMapper;

    @Override
    public Long getTotal(MerchantWarehouseData merchantWarehouseData) {
        return stockMapper.getTotal(merchantWarehouseData);
    }

    @Override
    public List<MerchantWarehouseData> selAllWarehouse(MerchantWarehouseData merchantWarehouseData) {
        return stockMapper.selAllWarehouse(merchantWarehouseData);
    }

    @Override
    public int addWarehouse(MerchantWarehouseData merchantWarehouseData) {
        return stockMapper.addWarehouse(merchantWarehouseData);
    }

    @Override
    public int updWarehouse(MerchantWarehouseData merchantWarehouseData) {
        return stockMapper.updWarehouse(merchantWarehouseData);
    }

    @Override
    public int delWareHouse(String Id) {
        return stockMapper.delWareHouse(Id);
    }

    @Override
    public MerchantWarehouseData selOneWareHouse(String Id) {
        return stockMapper.selOneWareHouse(Id);
    }

    @Override
    public List<MeasureUnitData> selMeasure() {
        return stockMapper.selMeasure();
    }
}
