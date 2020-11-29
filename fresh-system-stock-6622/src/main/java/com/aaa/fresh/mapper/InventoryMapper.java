package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.InventoryData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 库存管理
 */

@Mapper
@Component
public interface InventoryMapper {
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
