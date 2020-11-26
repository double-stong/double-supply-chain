package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.AccountingDocumentAuditingSellData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AccountingDocumentAuditingSellDataMapper {
    //查询一个进账审核信息
    AccountingDocumentAuditingSellData selectByPrimaryKey_DAS(String id);
    //添加一个 进账审核信息
    int insert_DAS(AccountingDocumentAuditingSellData record);
    //修改 进账审核状态
    int update_DAS(AccountingDocumentAuditingSellData record);

}