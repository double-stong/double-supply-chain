package com.aaa.fresh.service;

import com.aaa.fresh.pojo.InventoryData;

import java.util.List;

public interface InventoryService {
    //查询总条数
    Long getTotal(InventoryData inventoryData);
    //查询库存
    List<InventoryData> selAllInventory(InventoryData inventoryData);
    //修改库存
    int updInventory(InventoryData inventoryData);
    //删除
    int delInventory(String Id);
    //添加库存
    int addInventory(InventoryData inventoryData);
    //查询单个库存信息
    InventoryData selOneInventory(String Id);
}
