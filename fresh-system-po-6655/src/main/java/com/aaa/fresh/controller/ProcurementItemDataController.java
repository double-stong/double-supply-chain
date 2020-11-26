package com.aaa.fresh.controller;

import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.ProcurementItemData;
import com.aaa.fresh.service.ProcurementItemDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
/*
*订单项目*/
@Controller
public class ProcurementItemDataController {

    @Autowired
    ProcurementItemDataService procurementItemDataService;


    @GetMapping("/po/items")
    public CommonResult prs(ProcurementItemData item){
        if (item.getPage()!=null && item.getSize()!=null){
            item.setPage((item.getPage()-1) * item.getSize());
        }
        item.setPage(1);
        item.setSize(3);

        List<ProcurementItemData> prs= procurementItemDataService.selectAll(item);
        Long total = procurementItemDataService.allTotal(item);
        System.out.println(prs);
        if (prs!=null){
            return new CommonResult(200,"查询所有的采购项目",prs,total);
        }else {
            return new CommonResult(444,"未查询到采购项目",null,null);
        }
    };

    @PostMapping("/po/insitems")
    public CommonResult addWarehouse(){
        //List<ProcurementItemData> items
        List<ProcurementItemData> items=new ArrayList<>();
        System.out.println(items);

        items.add(new ProcurementItemData("5","t1","t1",10,"1000003","进行中",1,null,null,null));
        items.add(new ProcurementItemData("6","t2","t2",100,"1000003","进行中",1,null,null,null));
        System.out.println(items);
        int i = procurementItemDataService.insert(items);
        if (i>0){
            return new CommonResult(200,"添加成功",i,null);
        }else {
            return new CommonResult(444,"添加失败",null,null);
        }
    }

    @PutMapping("/po/upditem")
    public CommonResult updWarehouse(ProcurementItemData item){
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");

        int i = procurementItemDataService.update(item);
        if (i>0){
            return new CommonResult(200,"修改成功",i,null);
        }else {
            return new CommonResult(444,"修改失败",null,null);
        }
    }


}
