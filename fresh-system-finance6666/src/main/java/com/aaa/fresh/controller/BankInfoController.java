package com.aaa.fresh.controller;

import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.*;

import com.aaa.fresh.service.BankingPracticeService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/bankInfoController")
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
            return new CommonResult(200,"成功",accountBankData,null);
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
            return new CommonResult(200,"成功",res,null);
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
            return new CommonResult(200,"成功",bpi,null);
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
            return new CommonResult(200,"成功",res,null);
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
            return new CommonResult(200,"成功",res,null);
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
            return new CommonResult(200,"成功",bsi,null);
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
            return new CommonResult(200,"成功",res,null);
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
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   查询所有 进账详细信息
     * */
    @GetMapping("/selectAllBPI")
    public CommonResult selectAllBPI(AccountBankProcurementInfoData_vo abpi){
        //查询总条数
        if (abpi.getPage()!=null
                && abpi.getSize()!=null){
            abpi.setPage((abpi.getPage()-1)*
                    abpi.getSize());
        }
        Long total = bankingPracticeService.getTotal(abpi);

        List<AccountBankProcurementInfoData_vo> bpi  = bankingPracticeService.selectAll_BPI(abpi);
        if (bpi!=null){
            return new CommonResult(200,"成功",bpi,total);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

}
