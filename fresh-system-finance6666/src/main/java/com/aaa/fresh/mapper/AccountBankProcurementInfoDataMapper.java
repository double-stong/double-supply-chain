package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.AccountBankProcurementInfoData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AccountBankProcurementInfoDataMapper {
    //查询所有 采购转账消费详细信息
    List<AccountBankProcurementInfoData> selectAll_BPI();

    //查询一个转账消费详细信息
    AccountBankProcurementInfoData selectByPrimaryKey_BPI(String id);

    //添加采购消费转账详细信息
    int insert_BPI(AccountBankProcurementInfoData record);


    //修改 采购消费详细信息
    int updateByPrimaryKey_BPI(AccountBankProcurementInfoData record);

}