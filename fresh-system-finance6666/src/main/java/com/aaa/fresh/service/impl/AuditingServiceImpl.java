package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.AccountingDocumentAuditingProcurementDataMapper;
import com.aaa.fresh.mapper.AccountingDocumentAuditingSellDataMapper;
import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData_vo;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData_vo;
import com.aaa.fresh.service.AuditingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditingServiceImpl implements AuditingService {
    @Autowired
    AccountingDocumentAuditingProcurementDataMapper accountingDocumentAuditingProcurementDataMapper;
    @Autowired
    AccountingDocumentAuditingSellDataMapper accountingDocumentAuditingSellDataMapper;

    @Override
    public AccountingDocumentAuditingProcurementData selectByPrimaryKey_DAP(String id) {
        return accountingDocumentAuditingProcurementDataMapper.selectByPrimaryKey_DAP(id);
    }

    @Override
    public int insert_DAP(AccountingDocumentAuditingProcurementData record) {
        return accountingDocumentAuditingProcurementDataMapper.insert_DAP(record);
    }

    @Override
    public int update_DAP(AccountingDocumentAuditingProcurementData record) {
        return accountingDocumentAuditingProcurementDataMapper.update_DAP(record);
    }

    @Override
    public AccountingDocumentAuditingSellData selectByPrimaryKey_DAS(String id) {
        return accountingDocumentAuditingSellDataMapper.selectByPrimaryKey_DAS(id);
    }

    @Override
    public int insert_DAS(AccountingDocumentAuditingSellData record) {
        return accountingDocumentAuditingSellDataMapper.insert_DAS(record);
    }

    @Override
    public int update_DAS(AccountingDocumentAuditingSellData record) {
        return accountingDocumentAuditingSellDataMapper.update_DAS(record);
    }

    @Override
    public Long getTotal_DAP(AccountingDocumentAuditingProcurementData_vo adapdv) {
        return accountingDocumentAuditingProcurementDataMapper.getTotal_DAP(adapdv);
    }

    @Override
    public List<AccountingDocumentAuditingProcurementData_vo> selectAll_DAP(AccountingDocumentAuditingProcurementData_vo adapdv) {
        return accountingDocumentAuditingProcurementDataMapper.selectAll_DAP(adapdv);
    }

    @Override
    public Long getTotal_DAS(AccountingDocumentAuditingSellData_vo adasd) {
        return accountingDocumentAuditingSellDataMapper.getTotal_DAS(adasd);
    }

    @Override
    public List<AccountingDocumentAuditingSellData_vo> selectAll_DAS(AccountingDocumentAuditingSellData_vo adasd) {
        return accountingDocumentAuditingSellDataMapper.selectAll_DAS(adasd);
    }


}
