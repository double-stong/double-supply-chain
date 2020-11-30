package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingProcurementData_vo;
import com.aaa.fresh.pojo.ProcurementRequirementData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AccountingDocumentAuditingProcurementDataMapper {
    //查询总条数  分页
    Long getTotal_DAP(AccountingDocumentAuditingProcurementData_vo adapdv);
    //查询所有 采购状态信息
    List<AccountingDocumentAuditingProcurementData_vo> selectAll_DAP(AccountingDocumentAuditingProcurementData_vo adapdv);

    //查询一个 采购审核信息
    AccountingDocumentAuditingProcurementData selectByPrimaryKey_DAP(String id);
    //添加一个 采购审核信息
    int insert_DAP(AccountingDocumentAuditingProcurementData record);
    //修改 采购订单审核状态
    int update_PRD(ProcurementRequirementData prd);


}