package com.aaa.fresh.controller;

import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.DestroyedRegistrationData;
import com.aaa.fresh.service.DestoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 损耗登记controller
 */
@Slf4j
@RestController
@RequestMapping("/stock")
public class DestroyedController {
    @Autowired
    private DestoryService destoryService;
    /**
     * 查询所有的损耗登记
     * @param destData
     * @return
     */
    @GetMapping("/selAllDestroy")
    public CommonResult selAllDestroy(DestroyedRegistrationData destData){
        //查询总条数
        System.out.println("获取到的数据"+destData);
        if (destData.getPage()!=null
                && destData.getSize()!=null){
            destData.setPage((destData.getPage()-1)*
                    destData.getSize());
        }

        Long total = destoryService.getTotal(destData);
        List<DestroyedRegistrationData> res = destoryService.selAllDestroy(destData);

        if (res!=null){
            return new CommonResult(200,"查询库存成功",res,total);
        }else {
            return new CommonResult(444,"查询库存失败",null,null);

        }
    }

    /**
     * 添加损耗登记
     * @param destData
     * @return
     */
    @PostMapping("/addDestroy")
    public CommonResult addDestroy(DestroyedRegistrationData destData){
        destData.setId(IdUtil.objectId());
        int res = destoryService.addDestroy(destData);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 修改损耗登记表
     * @param destData
     * @return
     */
    @PutMapping("/updDestroy")
    public CommonResult updDestroy(DestroyedRegistrationData destData){
        int res = destoryService.updDestroy(destData);
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
    @DeleteMapping("/delDestroy/{Id}")
    public CommonResult delDestroy(@PathVariable("Id") String Id){
        int res = destoryService.delDestroy(Id);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 查询单个损耗信息
     * @param Id
     * @return
     */
    @GetMapping("/selOneDestroy/{Id}")
    public CommonResult selOneDestroy(@PathVariable("Id") String Id){
        DestroyedRegistrationData inventoryData = destoryService.selOneDestroy(Id);
        if (inventoryData!= null){
            return new CommonResult(200,"查询成功",inventoryData,null);
        }else {
            return new CommonResult(200,"查询成功",null,null);
        }
    }
}
