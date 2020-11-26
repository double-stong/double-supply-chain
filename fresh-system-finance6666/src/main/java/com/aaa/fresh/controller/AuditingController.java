package com.aaa.fresh.controller;

import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData_vo;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData;
import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.service.AuditingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/auditingController")
public class AuditingController extends BaseController {
    @Autowired
    AuditingService auditingService;

    /*
     *   查询一个 采购审批信息
     * */
    @GetMapping("/selectDAP/{id}")
    public CommonResult selectDAP(@PathVariable("id")String id){
        AccountingDocumentAuditingProcurementData dap= auditingService.selectByPrimaryKey_DAP(id);
        if (dap!=null){
            return new CommonResult(200,"成功",dap,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   添加 采购审批信息
     * */
    @PutMapping("/insertDAP")
    public CommonResult insertDAP(AccountingDocumentAuditingProcurementData record){
        int res = auditingService.insert_DAP(record);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   修改 采购审批 状态
     * */
    @PostMapping("/updateDAP")
    public CommonResult updateDAP(AccountingDocumentAuditingProcurementData record){
        int res = auditingService.update_DAP(record);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   查询一个 进账审批信息
     * */
    @GetMapping("/selectDAS/{id}")
    public CommonResult selectDAS(@PathVariable("id")String id){
        AccountingDocumentAuditingSellData das = auditingService.selectByPrimaryKey_DAS(id);
        if (das!=null){
            return new CommonResult(200,"成功",das,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   添加 进账审批 信息
     * */
    @PutMapping("/insertDAS")
    public CommonResult insertDAS(AccountingDocumentAuditingSellData record){
        int res = auditingService.insert_DAS(record);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   修改 进账审批状态
     * */
    @PostMapping("/updateDAS")
    public CommonResult updateDAS(AccountingDocumentAuditingSellData record){
        int res = auditingService.update_DAS(record);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   查询所有 进账审批信息
     * */
    @GetMapping("/selectAllDAP")
    public CommonResult selectAllDAP(AccountingDocumentAuditingProcurementData_vo adapdv){
        //查询总条数
        if (adapdv.getPage()!=null
                && adapdv.getSize()!=null){
            adapdv.setPage((adapdv.getPage()-1)*
                    adapdv.getSize());
        }
        Long total = auditingService.getTotal(adapdv);

        List<AccountingDocumentAuditingProcurementData_vo> das = auditingService.selectAll_DAP(adapdv);
        if (das!=null){
            return new CommonResult(200,"成功",das,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

}
