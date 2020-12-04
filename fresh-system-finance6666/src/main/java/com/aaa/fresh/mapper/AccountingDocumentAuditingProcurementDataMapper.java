package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AccountingDocumentAuditingProcurementDataMapper {
    //查询所有采购订单
    List<ProcurementRequirementData> selectAll_PRD(ProcurementRequirementData prd);
    //查询所有订单商品信息
    List<ProcurementItemData> selectAll_PID(ProcurementItemData pid);

    //查询所有 采购状态信息
    List<AccountingDocumentAuditingProcurementData_vo> selectAll_DAP(AccountingDocumentAuditingProcurementData_vo adapdv);

    //查询一个 采购审核信息
    AccountingDocumentAuditingProcurementData selectByPrimaryKey_DAP(String id);
    //添加一个 采购审核信息
    int insert_DAP(AccountingDocumentAuditingProcurementData record);
    //修改 采购订单审核状态  同事添加
    int update_PRD(ProcurementRequirementData prd);


}