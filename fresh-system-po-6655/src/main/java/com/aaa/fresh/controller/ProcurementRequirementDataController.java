package com.aaa.fresh.controller;

import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.ProcurementItemData;
import com.aaa.fresh.pojo.ProcurementRequirementData;
import com.aaa.fresh.pojo.ProcurementRequirementDataVo;
import com.aaa.fresh.service.ProcurementItemDataService;
import com.aaa.fresh.service.ProcurementRequirementDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ProcurementRequirementDataController {
    @Autowired
    ProcurementRequirementDataService procurementRequirementDataService;
    @Autowired
    ProcurementItemDataService procurementItemDataService;


    @GetMapping("/po/items")
    public CommonResult seleAllItems(ProcurementRequirementData pro){
        if (pro.getPage()!=null && pro.getSize()!=null){
            pro.setPage((pro.getPage()-1) * pro.getSize());
        }
        pro.setPage(1);
        pro.setSize(3);

        List<ProcurementRequirementData> prs= procurementRequirementDataService.selectAll(pro);
        Long total = procurementRequirementDataService.allTotal(pro);
        System.out.println(prs);
        if (prs!=null){
            return new CommonResult(200,"查询所有的采购订单",prs,total);
        }else {
            return new CommonResult(444,"未查询到采购订单",null,null);
        }
    };

    @PostMapping("/po/insitems")
    public CommonResult addItems(ProcurementRequirementDataVo prvo){

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

    @PutMapping("/po/upditem")
    public CommonResult updItem(ProcurementRequirementData pro){
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
