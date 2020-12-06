package com.aaa.fresh.controller;

import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.InventoryData;
import com.aaa.fresh.pojo.ProcurementRequirementDataVo;
import com.aaa.fresh.pojo.StockChangeItemData;
import com.aaa.fresh.service.InventoryService;
import com.aaa.fresh.service.Po6655;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 库存管理controller
 */
@RestController
@RequestMapping("/stock")
public class InventoryController extends BaseController {
    @Autowired
    private InventoryService inventoryService;

//    @Resource
//    private Po6655 po6655;


    /**
     * 查询所有的
     * @param inventoryData
     * @return
     */
    @GetMapping("/selAllInventory")
    public CommonResult<List<InventoryData>> selAllInventory(InventoryData inventoryData){
        //查询总条数

        if (inventoryData.getPage()!=null
                && inventoryData.getSize()!=null){
            inventoryData.setPage((inventoryData.getPage()-1)*
                    inventoryData.getSize());
        }

        Long total = inventoryService.getTotal(inventoryData);
        List<InventoryData> inventoryData1 = inventoryService.selAllInventory(inventoryData);

        if (inventoryData1!=null){
            return new CommonResult<>(200,"查询库存成功",inventoryData1,total);
        }else {
            return new CommonResult<>(444,"查询库存失败",null,null);

        }
    }

    /**
     * 添加库存
     * @param inventoryData
     * @return
     */
    @PostMapping("/addInventory")
    public CommonResult<Integer> addInventory(InventoryData inventoryData){
        inventoryData.setId(IdUtil.objectId());
        int res = inventoryService.addInventory(inventoryData);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 修改库存
     * @param inventoryData
     * @return
     */
    @PutMapping("/updInventory")
    public CommonResult<Integer> updInventory(InventoryData inventoryData){
        System.out.println(inventoryData);
        int res = inventoryService.updInventory(inventoryData);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 删除库存
     * @param Id
     * @return
     */
    @DeleteMapping("/delInventory/{Id}")
    public CommonResult<Integer> delInventory(@PathVariable("Id") String Id){
        int res = inventoryService.delInventory(Id);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 查询单个库存信息
     * @param Id
     * @return
     */
    @GetMapping("/selOneInventory/{Id}")
    public CommonResult<InventoryData> selOneInventory(@PathVariable("Id") String Id){
        InventoryData inventoryData = inventoryService.selOneInventory(Id);
        if (inventoryData!= null){
            return new CommonResult<>(200,"查询成功",inventoryData,null);
        }else {
            return new CommonResult<>(200,"查询成功",null,null);
        }
    }

    /**
     * 根据商品的id和仓库的id查询商品单个信息
     * @param inventoryData
     * @return
     */
    @GetMapping("/selProductByInvent")
    public CommonResult<List<InventoryData>> selProductByInvent(InventoryData inventoryData){
        List<InventoryData> res = inventoryService.selProductByInvent(inventoryData);

        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 仓库调拨，根据商品的编号，仓库名称，来修改相应的库存信息
     * 减少调拨的库存
     * @param inventoryData
     * @return
     */
    @PutMapping("/updInventByIds")
    public CommonResult<Integer> updInventByIds(InventoryData inventoryData){
        int res = inventoryService.updInventByIds(inventoryData);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(200,"成功",null,null);
        }
    }

    /**
     * 添加调拨的库存
     * @param inventoryData
     * @return
     */
    @PutMapping("/addUpdInventByIds")
    public CommonResult<Integer> addUpdInventByIds(InventoryData inventoryData){
        int res = inventoryService.addUpdInventByIds(inventoryData);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(200,"成功",null,null);
        }
    }

    /**
     * 添加库存变化详细单
     * @param stockChangeItemData
     * @return
     */
    @PostMapping("/addStockChangeItem")
    public CommonResult<Integer> addStockChangeItem(StockChangeItemData stockChangeItemData){
        String Id = IdUtil.objectId();
        stockChangeItemData.setId(Id);
        int res = inventoryService.addStockChangeItem(stockChangeItemData);
        if (res>0){
            return new CommonResult<>(200,Id,res,null);
        }else {
            return new CommonResult<>(200,"成功",null,null);
        }
    }

//    @GetMapping("/consumer/po/insitems")
//    public CommonResult<Integer> addItems(ProcurementRequirementDataVo prvo){
//        int res = po6655.addItems(prvo);
//        if (res>0){
//            return new CommonResult<>(200,"成功",res,null);
//        }else {
//            return new CommonResult<>(200,"成功",null,null);
//        }
//    }
}
