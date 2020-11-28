package com.aaa.fresh.controller;

import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.StockTakingRecordData;
import com.aaa.fresh.service.TakeStockService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/stock")
@Slf4j
public class TakeStockController extends BaseController {

    @Resource
    private TakeStockService service;

    /**
     * 添加实物盘点详情
     * @return
     */
    @PostMapping(value = "/addTakeStock")
    public CommonResult<Integer> addTakeStock(HttpServletRequest request){
        StockTakingRecordData recordData = JSON.parseObject(request.getParameter("formData"), StockTakingRecordData.class);
        recordData.setId(IdUtil.objectId());
        int res = service.addTakeStock(recordData);
        if (res>0){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",-1,null);
        }
    }

    /*
     * 根据实物盘点的请求；来查询实物盘点详情
     */
    @GetMapping("/selAllTakeStock")
    public CommonResult<List<StockTakingRecordData>> selAllTakeStock(StockTakingRecordData recordData){
        List<StockTakingRecordData> res = service.selAllTakeStock(recordData);
        if (res!=null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }

    }
}
