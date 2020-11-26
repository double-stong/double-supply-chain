package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AccountingDocumentAuditingProcurementDataMapper {
    //查询一个 采购审核信息
    AccountingDocumentAuditingProcurementData selectByPrimaryKey_DAP(String id);
    //添加一个 采购审核信息
    int insert_DAP(AccountingDocumentAuditingProcurementData record);
    //修改 采购审核状态
    int update_DAP(AccountingDocumentAuditingProcurementData record);

}