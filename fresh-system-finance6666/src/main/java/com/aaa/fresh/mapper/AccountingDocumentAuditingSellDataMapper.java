package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.AccountBankSellInfoData_vo;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData;
import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData_vo;
import com.aaa.fresh.pojo.ContractOrderData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AccountingDocumentAuditingSellDataMapper {
    //查询所有 销售入账详细信息
    List<AccountingDocumentAuditingSellData_vo> selectAll_DAS(AccountingDocumentAuditingSellData_vo adasd);

    //查询一个进账审核信息
    AccountingDocumentAuditingSellData selectByPrimaryKey_DAS(String id);
    //添加一个 进账审核信息
    int insert_DAS(AccountingDocumentAuditingSellData record);
    //修改 进账审核状态 同时添加
    int update_COD(ContractOrderData cod);

}