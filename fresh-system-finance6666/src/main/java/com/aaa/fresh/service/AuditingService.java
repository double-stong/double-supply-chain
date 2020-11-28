package com.aaa.fresh.service;

import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData_vo;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData_vo;

import java.util.List;

public interface AuditingService {
    //查询一个 采购审核信息
    AccountingDocumentAuditingProcurementData selectByPrimaryKey_DAP(String id);
    //添加一个 采购审核信息
    int insert_DAP(AccountingDocumentAuditingProcurementData record);
    //修改 采购审核状态
    int update_DAP(AccountingDocumentAuditingProcurementData record);

    //查询一个进账审核信息
    AccountingDocumentAuditingSellData selectByPrimaryKey_DAS(String id);
    //添加一个 进账审核信息
    int insert_DAS(AccountingDocumentAuditingSellData record);
    //修改 进账审核状态
    int update_DAS(AccountingDocumentAuditingSellData record);

    //查询总条数  分页
    Long getTotal_DAP(AccountingDocumentAuditingProcurementData_vo adapdv);
    //查询所有 采购状态信息
    List<AccountingDocumentAuditingProcurementData_vo> selectAll_DAP(AccountingDocumentAuditingProcurementData_vo adapdv);

    //查询总条数  分页
    Long getTotal_DAS(AccountingDocumentAuditingSellData_vo adasd);
    //查询所有 销售入账详细信息
    List<AccountingDocumentAuditingSellData_vo> selectAll_DAS(AccountingDocumentAuditingSellData_vo adasd);


}
