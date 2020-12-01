package com.aaa.fresh.controller;


import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.*;
import com.aaa.fresh.service.StockChangeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RequestMapping("/stock")
@RestController
public class StockChangeController extends BaseController {

    @Resource
    private StockChangeService stockChangeService;

    /**
     * 查询所有的
     * @param stockChangeData
     * @return
     */
    @GetMapping("/selAllStockChange")
    public CommonResult<List<StockChangeData>> selAllStockChange(StockChangeData stockChangeData){

        if (stockChangeData.getPage()!=null
                && stockChangeData.getSize()!=null){
            stockChangeData.setPage((stockChangeData.getPage()-1)*
                    stockChangeData.getSize());
        }

        Long total = stockChangeService.getTotal(stockChangeData);

        List<StockChangeData> stockChangeData1 = stockChangeService.selAllStockChange(stockChangeData);

        if (stockChangeData1 != null){
            return new CommonResult<>(200,"成功",stockChangeData1,total);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }


    /**
     * 单个查询
     * @param Id
     * @return
     */
    @GetMapping("/selOneStockChange/{Id}")
    public CommonResult<StockChangeData> selOneStockChange(@PathVariable("Id") String Id){
        StockChangeData stockChangeData = stockChangeService.selOneStockChange(Id);


        if (stockChangeData!= null){
            return new CommonResult<>(200,"成功",stockChangeData,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 添加
     * @param stockChangeData
     * @return
     */
    @PostMapping("/addStockChange")
    public CommonResult<Integer> addStockChange(StockChangeData stockChangeData){
        stockChangeData.setId(IdUtil.objectId());
        int res = stockChangeService.addStockChange(stockChangeData);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 删除方法
     * @param Id
     * @return
     */
    @DeleteMapping("/delStockChange/{Id}")
    public CommonResult<Integer> delStockChange(String Id){
        int res = stockChangeService.delStockChange(Id);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 修改方法
     * @param stockChangeData
     * @return
     */
    @PutMapping("/updStockChange")
    public CommonResult<Integer> updStockChange(StockChangeData stockChangeData){
        int res = stockChangeService.updStockChange(stockChangeData);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 查询所有的库存变化方向
     * @return
     */
    @GetMapping("/selAllDirectinon")
    public CommonResult<List<StockChangeDirectionData>> selAllDirectinon(){
        List<StockChangeDirectionData> res = stockChangeService.selAllDirectinon();
        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);

        }
    }

    /**
     * 查询所有的改变方向
     * @return
     */
    @GetMapping("/selAllChangeType")
    public CommonResult<List<StockChangeTypeData>> selAllChangeType(){
        List<StockChangeTypeData> res = stockChangeService.selAllChangeType();
        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);

        }
    }

    @GetMapping("/selChangeItemById/{Id}")
    public CommonResult<StockChangeItemData> selChangeItemById(@PathVariable("Id") String Id){
        StockChangeItemData res = stockChangeService.selChangeItemById(Id);
        if (res!=null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 修改出入库的状态 默认为0 为未领取  修改值为1 状态为 已领取 减少库存
     * @param Id
     * @param version
     * @return
     */
    @PutMapping("/updChangeItemVersion")
    public CommonResult<Integer> updChangeItemVersion(String Id, Integer version){
        int res = stockChangeService.updChangeItemVersion(Id, version);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }
}
