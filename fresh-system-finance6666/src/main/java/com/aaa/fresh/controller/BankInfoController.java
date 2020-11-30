package com.aaa.fresh.controller;

import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.*;

import com.aaa.fresh.service.BankingPracticeService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/bankInfoController")//出帐入账 详情
public class BankInfoController extends BaseController {
    @Autowired
    BankingPracticeService bankingPracticeService;

    /*
    *   查询一个银行卡
    * */
    @GetMapping("/selectBank/{id}")
    public CommonResult selectBank(@PathVariable("id")String id){
        AccountBankData accountBankData = bankingPracticeService.selectByPrimaryKey_Bank(id);
        if (accountBankData!=null){
            return new CommonResult(0,"成功",accountBankData,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   修改资产 上升或下降
     * */
    @PostMapping("/updateBank")
    public CommonResult updateBank(AccountBankData record){
        int res = bankingPracticeService.updateByPrimaryKey_Bank(record);
        if (res>0){
            return new CommonResult(0,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   查询一个 转账消费详细信息
     * */
    @GetMapping("/selectBPI/{id}")
    public CommonResult selectBPI(@PathVariable("id")String id){
        AccountBankProcurementInfoData bpi  = bankingPracticeService.selectByPrimaryKey_BPI(id);
        if (bpi!=null){
            return new CommonResult(0,"成功",bpi,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   添加 采购消费转账详细信息
     * */
    @PutMapping("/insertBPI")
    public CommonResult insertBPI(AccountBankProcurementInfoData record){
        int res = bankingPracticeService.insert_BPI(record);
        if (res>0){
            return new CommonResult(0,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   修改 采购消费详细信息
     * */
    @PostMapping("/updateBPI")
    public CommonResult updateBPI(AccountBankProcurementInfoData record){
        int res = bankingPracticeService.updateByPrimaryKey_BPI(record);
        if (res>0){
            return new CommonResult(0,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   查询一个 进账详细信息
     * */
    @GetMapping("/selectBSI/{id}")
    public CommonResult selectBSI(@PathVariable("id")String id){
        AccountBankSellInfoData bsi  = bankingPracticeService.selectByPrimaryKey_BSI(id);
        if (bsi!=null){
            return new CommonResult(0,"成功",bsi,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   添加 进账详细信息
     * */
    @PutMapping("/insertBSI")
    public CommonResult insertBSI(AccountBankSellInfoData record){
        int res = bankingPracticeService.insert_BSI(record);
        if (res>0){
            return new CommonResult(0,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   修改 进账详细信息
     * */
    @PostMapping("/updateBSI")
    public CommonResult updateBSI(AccountBankSellInfoData record){
        int res = bankingPracticeService.updateByPrimaryKey_BSI(record);
        if (res>0){
            return new CommonResult(0,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   查询所有 采购转账消费详细信息
     * */
    @GetMapping("/selectAllBPI")
    public CommonResult selectAllBPI(AccountBankProcurementInfoData_vo abpi){

        //当前那一页
        int currentPage = abpi.getPage() == null ? 1:abpi.getPage();
        //当前页显示几条
        int pageSize = abpi.getLimit() == null ? 3:abpi.getLimit();
        //当前页  条数
        PageHelper.startPage(currentPage,pageSize);

        List<AccountBankProcurementInfoData_vo> bpi  = bankingPracticeService.selectAll_BPI(abpi);
        //把查询的所有数据 放到这个里面  自动分页
        PageInfo<AccountBankProcurementInfoData_vo> pageinfo = new PageInfo<AccountBankProcurementInfoData_vo>(bpi);

        //总条数
        Long total = Long.valueOf(pageinfo.getTotal()+"");
        //获取当前页的数据
        List<AccountBankProcurementInfoData_vo> list = pageinfo.getList();


        if (bpi!=null){
            return new CommonResult(0,"",list,total);
        }else {
            return new CommonResult(0,"",null,null);
        }
    }

    /*
     *   查询所有 销售入账详细信息
     * */
    @GetMapping("/selectAllBSI")
    public CommonResult selectAllBSI(AccountBankSellInfoData_vo absi){
        //当前那一页
        int currentPage = absi.getPage() == null ? 1:absi.getPage();
        //当前页显示几条
        int pageSize = absi.getLimit() == null ? 3:absi.getLimit();
        //当前页  条数
        PageHelper.startPage(currentPage,pageSize);

        List<AccountBankSellInfoData_vo> bsi  = bankingPracticeService.selectAll_BSI(absi);
        //把查询的所有数据 放到这个里面  自动分页
        PageInfo<AccountBankSellInfoData_vo> pageinfo = new PageInfo<AccountBankSellInfoData_vo>(bsi);

        //总条数
        Long total = Long.valueOf(pageinfo.getTotal()+"");
        //获取当前页的数据
        List<AccountBankSellInfoData_vo> list = pageinfo.getList();


        if (bsi!=null){
            return new CommonResult(0,"",list,total);
        }else {
            return new CommonResult(0,"",null,null);
        }
    }

}
