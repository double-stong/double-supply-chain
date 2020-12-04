package com.aaa.fresh.controller;

import com.aaa.fresh.config.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jumpController")
public class jumpController extends BaseController {
    /* 主页*/
    @GetMapping("/toHome")
    public String toHome(){
        return "home";
    }

    /* 查询所有 采购订单审核页面*/
    @GetMapping("/selectAllPRD")
    public String selectAllPRD(){
        return "selectAllPRD";
    }

    /* 查询所有 采购审核页面*/
    @GetMapping("/selectAllDAP")
    public String selectAllDAP(){
        return "/procurement/selectAllDAP";
    }

    /* 查询所有 采购总账页面*/
    @GetMapping("/selectAllBPI")
    public String selectAllBPI(){
        return "/procurement/selectAllBPI";
    }

    /* 查询所有 销售审核页面*/
    @GetMapping("/selectAllDAS")
    public String selectAllDAS(){
        return "/sell/selectAllDAS";
    }

    /* 查询所有 销售入账页面*/
    @GetMapping("/selectAllBSI")
    public String selectAllBSI(){
        return "/sell/selectAllBSI";
    }

}
