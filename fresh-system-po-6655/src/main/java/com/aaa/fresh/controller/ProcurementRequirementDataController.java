package com.aaa.fresh.controller;

import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.ProcurementRequirementData;
import com.aaa.fresh.service.ProcurementRequirementDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ProcurementRequirementDataController {
    @Autowired
    ProcurementRequirementDataService procurementRequirementDataService;


    @GetMapping("/po/prs")
    public CommonResult prs(ProcurementRequirementData pro){
        if (pro.getPage()!=null && pro.getSize()!=null){
            pro.setPage((pro.getPage()-1) * pro.getSize());
        }

        List<ProcurementRequirementData> prs= procurementRequirementDataService.selectAll(pro);
        Long total = procurementRequirementDataService.allTotal(pro);
        System.out.println(prs);
        if (prs!=null){
            return new CommonResult(200,"查询所有的采购订单",prs,total);
        }else {
            return new CommonResult(444,"未查询到采购订单",null,null);
        }
    };

    @PostMapping("/po/inspro")
    public CommonResult addWarehouse(ProcurementRequirementData pro1){
        ProcurementRequirementData pro=new ProcurementRequirementData("1000006","采购需求单7号","M000002","进行中",new Date(),null,1,null,null);

        int i = procurementRequirementDataService.insert(pro);
        if (i>0){
            return new CommonResult(200,"添加成功",i,null);
        }else {
            return new CommonResult(444,"添加失败",null,null);
        }
    }

    @PutMapping("/po/updpro")
    public CommonResult updWarehouse(ProcurementRequirementData pro){
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        int i = procurementRequirementDataService.update(pro);
        if (i>0){
            return new CommonResult(200,"修改成功",i,null);
        }else {
            return new CommonResult(444,"修改失败",null,null);
        }
    }


}
