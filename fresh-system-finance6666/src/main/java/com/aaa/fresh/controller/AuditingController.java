package com.aaa.fresh.controller;

import com.aaa.fresh.config.BaseController;
import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData;
import com.aaa.fresh.pojo.*;
import com.aaa.fresh.service.AuditingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/auditingController")//审批 出入账
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
            return new CommonResult(0,"成功",dap,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     * 修改采购订单状态 同时  添加 采购审批信息
     * */
    @PutMapping("/insertDAP")
    public CommonResult insertDAP(ProcurementRequirementData prd,AccountingDocumentAuditingProcurementData record){
        int result = auditingService.update_PRD(prd);
        if(result>0){
            int res = auditingService.insert_DAP(record);
            if (res>0){
                return new CommonResult(0,"成功",res,null);
            }else {
                return new CommonResult(444,"失败",null,null);
            }
        }
        return new CommonResult(444,"失败",null,null);
    }


    /*
     *   查询一个 进账审批信息
     * */
    @GetMapping("/selectDAS/{id}")
    public CommonResult selectDAS(@PathVariable("id")String id){
        AccountingDocumentAuditingSellData das = auditingService.selectByPrimaryKey_DAS(id);
        if (das!=null){
            return new CommonResult(0,"成功",das,null);
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
            return new CommonResult(0,"成功",res,null);
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
            return new CommonResult(0,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /*
     *   查询所有 采购审批状态信息
     * */
    @GetMapping("/selectAllDAP")
    public CommonResult selectAllDAP(AccountingDocumentAuditingProcurementData_vo adapdv){
        //当前那一页
        int currentPage = adapdv.getPage() == null ? 1:adapdv.getPage();
        //当前页显示几条
        int pageSize = adapdv.getLimit() == null ? 3:adapdv.getLimit();
        //当前页  条数
        PageHelper.startPage(currentPage,pageSize);

        List<AccountingDocumentAuditingProcurementData_vo> dap = auditingService.selectAll_DAP(adapdv);

        //把查询的所有数据 放到这个里面  自动分页
        PageInfo<AccountingDocumentAuditingProcurementData_vo> pageinfo = new PageInfo<AccountingDocumentAuditingProcurementData_vo>(dap);
        //总条数
        Long total = Long.valueOf(pageinfo.getTotal()+"");
        //获取当前页的数据
        List<AccountingDocumentAuditingProcurementData_vo> list = pageinfo.getList();

        if (dap!=null){
            return new CommonResult(0,"",list,total);
        }else {
            return new CommonResult(0,"",null,null);
        }
    }

    /*
     *   查询所有 销售审批状态信息
     * */
    @GetMapping("/selectAllDAS")
    public CommonResult selectAllDAS(AccountingDocumentAuditingSellData_vo adasd){
        //当前那一页
        int currentPage = adasd.getPage() == null ? 1:adasd.getPage();
        //当前页显示几条
        int pageSize = adasd.getLimit() == null ? 3:adasd.getLimit();
        //当前页  条数
        PageHelper.startPage(currentPage,pageSize);

        List<AccountingDocumentAuditingSellData_vo> das = auditingService.selectAll_DAS(adasd);
        //把查询的所有数据 放到这个里面  自动分页
        PageInfo<AccountingDocumentAuditingSellData_vo> pageinfo = new PageInfo<AccountingDocumentAuditingSellData_vo>(das);

        //总条数
        Long total = Long.valueOf(pageinfo.getTotal()+"");
        //获取当前页的数据
        List<AccountingDocumentAuditingSellData_vo> list = pageinfo.getList();

        if (das!=null){
            return new CommonResult(0,"",list,total);
        }else {
            return new CommonResult(0,"",null,null);
        }

    }

}
