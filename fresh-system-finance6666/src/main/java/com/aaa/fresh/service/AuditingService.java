package com.aaa.fresh.service;

import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData;

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
}
