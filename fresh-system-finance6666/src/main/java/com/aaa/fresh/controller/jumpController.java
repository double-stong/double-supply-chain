package com.aaa.fresh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jumpController")
public class jumpController {
    @RequestMapping("/selectAllAuditingInfo")
    public String getIndex(){
        return "selectAllAuditingInfo";
    }
}
