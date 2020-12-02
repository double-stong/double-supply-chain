package com.aaa.fresh.controller;

import cn.hutool.core.util.IdUtil;
import com.aaa.fresh.pojo.*;
import com.aaa.fresh.service.ProcurementItemDataService;
import com.aaa.fresh.service.ProcurementRequirementDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ProcurementRequirementDataController {
    @Autowired
    ProcurementRequirementDataService procurementRequirementDataService;
    @Autowired
    ProcurementItemDataService procurementItemDataService;


    @GetMapping("/po/pros")
    public ReturnObj seleAllpros(ProcurementRequirementData pro ){
        ReturnObj obj =  procurementRequirementDataService.selectAll(pro);
        return obj;
//        List<ProcurementRequirementData> prs= procurementRequirementDataService.selectAll(pro);
//        Long total = procurementRequirementDataService.allTotal(pro);
//        System.out.println(prs);
//        model.addAttribute("prs",prs);
//
//        if (prs!=null){
//            return new CommonResult(200,"查询到采购订单",prs,total);
//        }else {
//            return new CommonResult(444,"未查询到采购订单",null,null);
//        }
    };

    @PostMapping("/po/addpo")
    public CommonResult addProandItems(ProcurementRequirementDataVo prvo){
        System.out.println(IdUtil.objectId());
        Double totalprice=10*100.00+100*100.00;
        List<ProcurementItemData> items=new ArrayList<>();

        ProcurementRequirementData pro= new ProcurementRequirementData("1000004","采购需求单4号","M000002","进行中",new Date(),null,totalprice,"未审核",1,null,null);
        items.add(new ProcurementItemData("7","t7","t7",10,100.00,"1000004","进行中",1,null,null,null));
        items.add(new ProcurementItemData("8","t8","t8",100,100.00,"1000004","进行中",1,null,null,null));
        System.out.println(items);
        ProcurementRequirementDataVo prvo1 =new ProcurementRequirementDataVo(pro,items,null,null);

        int pr = procurementRequirementDataService.insert(prvo1);

        if (pr>0){
            return new CommonResult(200,"添加成功",1,null);
        }else {
            return new CommonResult(444,"添加失败",null,null);
        }
    }

    @PutMapping("/po/updpro")
    public CommonResult updpro(ProcurementRequirementData pro){
        Double totalprice=10*100.00+100*100.00;
        ProcurementRequirementData pro1= new ProcurementRequirementData("1000004","采购需求单4号","M000002","进行中",new Date(),null,totalprice,"审核完成",1,null,null);

        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        int i = procurementRequirementDataService.update(pro1);
        if (i>0){
            return new CommonResult(200,"修改成功",i,null);
        }else {
            return new CommonResult(444,"修改失败",null,null);
        }
    }


}
