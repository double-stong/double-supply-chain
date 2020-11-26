package com.aaa.fresh.service;

import com.aaa.fresh.pojo.AccountBankData;
import com.aaa.fresh.pojo.AccountBankProcurementInfoData;
import com.aaa.fresh.pojo.AccountBankProcurementInfoData_vo;
import com.aaa.fresh.pojo.AccountBankSellInfoData;

import java.util.List;

public interface BankingPracticeService {
    //查询一个银行卡
    AccountBankData selectByPrimaryKey_Bank(String id);
    //资产上升或下降
    int updateByPrimaryKey_Bank(AccountBankData record);

    //查询一个转账消费详细信息
    AccountBankProcurementInfoData selectByPrimaryKey_BPI(String id);
    //添加采购消费转账详细信息
    int insert_BPI(AccountBankProcurementInfoData record);
    //修改 采购消费详细信息
    int updateByPrimaryKey_BPI(AccountBankProcurementInfoData record);

    //查询一个进账详细信息
    AccountBankSellInfoData selectByPrimaryKey_BSI(String id);
    //添加进账详细信息
    int insert_BSI(AccountBankSellInfoData record);
    //修改进账详细信息
    int updateByPrimaryKey_BSI(AccountBankSellInfoData record);

    //查询总条数  分页
    Long getTotal(AccountBankProcurementInfoData_vo abpidv);
    //查询所有 采购转账消费详细信息
    List<AccountBankProcurementInfoData_vo> selectAll_BPI(AccountBankProcurementInfoData_vo abpidv);



}