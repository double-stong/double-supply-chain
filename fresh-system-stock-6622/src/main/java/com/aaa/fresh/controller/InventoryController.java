package com.aaa.fresh.controller;

import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.InventoryData;
import com.aaa.fresh.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 库存管理controller
 */
@RestController
@RequestMapping("/stock")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    /**
     * 查询所有的
     * @param inventoryData
     * @return
     */
    @GetMapping("/selAllInventory")
    public CommonResult selAllInventory(InventoryData inventoryData){
        //查询总条数

        if (inventoryData.getPage()!=null
                && inventoryData.getSize()!=null){
            inventoryData.setPage((inventoryData.getPage()-1)*
                    inventoryData.getSize());
        }

        Long total = inventoryService.getTotal(inventoryData);
        List<InventoryData> inventoryData1 = inventoryService.selAllInventory(inventoryData);

        if (inventoryData1!=null){
            return new CommonResult(200,"查询库存成功",inventoryData1,total);
        }else {
            return new CommonResult(444,"查询库存失败",null,null);

        }
    }

    /**
     * 添加库存
     * @param inventoryData
     * @return
     */
    @PostMapping("/addInventory")
    public CommonResult addInventory(InventoryData inventoryData){
        inventoryData.setId(IdUtil.objectId());
        int res = inventoryService.addInventory(inventoryData);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 修改库存
     * @param inventoryData
     * @return
     */
    @PutMapping("/updInventory")
    public CommonResult updInventory(InventoryData inventoryData){
        System.out.println(inventoryData);
        int res = inventoryService.updInventory(inventoryData);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 删除库存
     * @param Id
     * @return
     */
    @DeleteMapping("/delInventory/{Id}")
    public CommonResult delInventory(@PathVariable("Id") String Id){
        int res = inventoryService.delInventory(Id);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 查询单个库存信息
     * @param Id
     * @return
     */
    @GetMapping("/selOneInventory/{Id}")
    public CommonResult selOneInventory(@PathVariable("Id") String Id){
        InventoryData inventoryData = inventoryService.selOneInventory(Id);
        if (inventoryData!= null){
            return new CommonResult(200,"查询成功",inventoryData,null);
        }else {
            return new CommonResult(200,"查询成功",null,null);
        }
    }

}
