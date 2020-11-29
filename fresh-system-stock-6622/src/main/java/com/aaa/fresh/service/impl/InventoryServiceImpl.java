package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.InventoryMapper;
import com.aaa.fresh.pojo.InventoryData;
import com.aaa.fresh.service.InventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Resource
    private InventoryMapper inventoryMapper;

    @Override
    public Long getTotal(InventoryData inventoryData) {
        return inventoryMapper.getTotal(inventoryData);
    }

    @Override
    public List<InventoryData> selAllInventory(InventoryData inventoryData) {
        return inventoryMapper.selAllInventory(inventoryData);
    }

    @Override
    public int updInventory(InventoryData inventoryData) {
        return inventoryMapper.updInventory(inventoryData);
    }

    @Override
    public int delInventory(String Id) {
        return inventoryMapper.delInventory(Id);
    }

    @Override
    public int addInventory(InventoryData inventoryData) {
        return inventoryMapper.addInventory(inventoryData);
    }

    @Override
    public InventoryData selOneInventory(String Id) {
        return inventoryMapper.selOneInventory(Id);
    }

    @Override
    public List<InventoryData> selProductByInvent(InventoryData inventoryData) {
        return inventoryMapper.selProductByInvent(inventoryData);
    }

    @Override
    public int updInventByIds(InventoryData inventoryData) {
        return inventoryMapper.updInventByIds(inventoryData);
    }

    @Override
    public int addUpdInventByIds(InventoryData inventoryData) {
        return inventoryMapper.addUpdInventByIds(inventoryData);
    }
}
