package com.aaa.fresh.controller;

import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.*;
import com.aaa.fresh.service.StockRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/stock")
public class StockRecordController extends BaseController {

    @Resource
    private StockRecordService stockRecordService;


    /**
     * 查询所有的损耗登记
     * @param stockTakingData
     * @return
     */
    @GetMapping("/selAllStockTaking")
    public CommonResult<List<StockTakingData>> selAllStockTaking( StockTakingData stockTakingData){
        //查询总条数
        System.out.println("接收的数据"+stockTakingData);
        if (stockTakingData.getPage()!=null
                && stockTakingData.getSize()!=null){
            stockTakingData.setPage((stockTakingData.getPage()-1)*
                    stockTakingData.getSize());
        }

        Long total = stockRecordService.getTotal(stockTakingData);
        List<StockTakingData> res = stockRecordService.selAllStockTaking(stockTakingData);

        if (res!=null){
            return new CommonResult<>(200,"查询库存成功",res,total);
        }else {
            return new CommonResult<>(444,"查询库存失败",null,null);

        }
    }

    /**
     * 添加损耗登记
     * @param stockTakingData
     * @return
     */
    @PostMapping("/addStockTaking")
    public CommonResult addStockTaking(StockTakingData stockTakingData){
        stockTakingData.setId(IdUtil.objectId());
        log.info(stockTakingData.toString());
        int res = stockRecordService.addStockTaking(stockTakingData);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 修改损耗登记表
     * @param stockTakingData
     * @return
     */
    @PutMapping("/updStockTaking")
    public CommonResult updStockTaking(StockTakingData stockTakingData){
        int res = stockRecordService.updStockTaking(stockTakingData);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 删除损耗登记
     * @param Id
     * @return
     */
    @DeleteMapping("/delStockTaking/{Id}")
    public CommonResult<Integer> delStockTaking(@PathVariable("Id") String Id){
        int res = stockRecordService.delStockTaking(Id);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 查询单个损耗信息
     * @param Id
     * @return
     */
    @GetMapping("/selOneStockTaking/{Id}")
    public CommonResult<StockTakingData> selOneStockTaking(@PathVariable("Id") String Id){
        StockTakingData res = stockRecordService.selOneStockTaking(Id);
        if (res!= null){
            return new CommonResult<StockTakingData>(200,"查询成功",res,null);
        }else {
            return new CommonResult<>(200,"查询成功",null,null);
        }
    }

    /**
     * 查询盘点结果表
     * @return
     */
    @GetMapping("/selAllStockTakingResult")
    public  CommonResult<List<StockTakingResultData>> selAllStockTakingResult(){
        List<StockTakingResultData> res = stockRecordService.selAllStockTakingResult();
        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }
    @GetMapping("/selStockTakingStauts")
    public CommonResult<List<StockTakingStatusData>> selStockTakingStauts(){
        List<StockTakingStatusData> res = stockRecordService.selStockTakingStauts();
        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }



}
