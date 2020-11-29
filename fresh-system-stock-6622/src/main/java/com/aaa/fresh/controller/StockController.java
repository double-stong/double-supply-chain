package com.aaa.fresh.controller;

import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.MeasureUnitData;
import com.aaa.fresh.pojo.MerchantWarehouseData;
import com.aaa.fresh.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 仓库管理控制层
 */
@RestController
@Slf4j
@RequestMapping("/stock")
public class StockController extends BaseController {
    @Autowired
    private StockService stockService;

    /**
     * 查询所有的仓库信息
     * @return
     */
    @GetMapping("/selAllWarehouse")
    public CommonResult selAllWarehouse(MerchantWarehouseData merchant){
        if (merchant.getPage()!=null
        && merchant.getSize()!=null){
            merchant.setPage((merchant.getPage()-1)*
                    merchant.getSize());
        }
        List<MerchantWarehouseData> warehouseData = stockService.selAllWarehouse(merchant);
        Long total = stockService.getTotal(merchant);
        if (warehouseData!=null){
            return new CommonResult(200,"查询所有的仓库信息",warehouseData,total);
        }else {
            return new CommonResult(444,"未查询到信息",null,null);
        }
    }

    /**
     * 添加仓库信息
     * @param merchantWarehouseData
     * @return
     */
    @PostMapping("/addWarehouse")
    public CommonResult addWarehouse(MerchantWarehouseData merchantWarehouseData){
        merchantWarehouseData.setId(IdUtil.objectId());
        int res = stockService.addWarehouse(merchantWarehouseData);
        if (res>0){
            return new CommonResult(200,"添加成功",res,null);
        }else {
            return new CommonResult(444,"添加失败",null,null);
        }
    }

    /**
     * 修改仓库信息
     * @param merchantWarehouseData
     * @return
     */
    @PutMapping("/updWarehouse")
    public CommonResult<Integer> updWarehouse(MerchantWarehouseData merchantWarehouseData){
        int res = stockService.updWarehouse(merchantWarehouseData);
        if (res>0){
            return new CommonResult<>(200,"修改成功",res,null);
        }else {
            return new CommonResult<>(444,"修改失败",null,null);
        }
    }

    /**
     * 删除仓库信息
     * @param id
     * @return
     */
    @DeleteMapping("/delWareHouse/{id}")
    public CommonResult delWareHouse(@PathVariable("id") String id){
        int res = stockService.delWareHouse(id);
        if (res>0){
            return new CommonResult(200,"删除成功",res,null);
        }else {
            return new CommonResult(444,"删除失败",null,null);
        }
    }


    /**
     * 查询计量单位
     * @return
     */
    @GetMapping("/selMeasure")
    public CommonResult selMeasure(){
        List<MeasureUnitData> measureUnitData = stockService.selMeasure();
        if (measureUnitData!=null){
            return new CommonResult(200,"计量单位查询成功",measureUnitData,null);
        }else {
            return new CommonResult(444,"计量单位查询失败",null,null);
        }
    }

    /**
     * 查询单个仓库信息
     * @param Id
     * @return
     */
    @GetMapping("/selOneWareHouse/{Id}")
    public CommonResult selOneWareHouse(@PathVariable("Id") String Id){
        MerchantWarehouseData res = stockService.selOneWareHouse(Id);
        if (res!=null){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

}









