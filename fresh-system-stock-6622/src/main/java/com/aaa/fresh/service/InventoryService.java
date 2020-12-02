package com.aaa.fresh.service;

import com.aaa.fresh.pojo.InventoryData;
import com.aaa.fresh.pojo.StockChangeItemData;

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
    //根据仓库id查询商品库存信息
    List<InventoryData> selProductByInvent(InventoryData inventoryData);

    //仓库调拨，根据商品的编号，仓库名称，来修改相应的库存信息
    int updInventByIds(InventoryData inventoryData);
    //添加库存
    int addUpdInventByIds(InventoryData inventoryData);
    //添加出入库详情单
    int addStockChangeItem(StockChangeItemData stockChangeItemData);
}
