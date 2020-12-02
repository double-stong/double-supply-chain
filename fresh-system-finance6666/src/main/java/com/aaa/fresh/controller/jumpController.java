package com.aaa.fresh.controller;

import com.aaa.fresh.config.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jumpController")
public class jumpController extends BaseController {
    /* 查询所有 采购审核页面*/
    @GetMapping("/selectAllDAP")
    public String selectAllDAP(){
        return "selectAllDAP";
    }

    /* 查询所有 采购审核页面*/
    @GetMapping("/selectAllBPI")
    public String selectAllBPI(){
        return "selectAllBPI";
    }

}
