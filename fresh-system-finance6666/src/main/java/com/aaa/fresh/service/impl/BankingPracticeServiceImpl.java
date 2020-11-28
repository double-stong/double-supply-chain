package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.AccountBankDataMapper;
import com.aaa.fresh.mapper.AccountBankProcurementInfoDataMapper;
import com.aaa.fresh.mapper.AccountBankSellInfoDataMapper;
import com.aaa.fresh.pojo.*;
import com.aaa.fresh.service.BankingPracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankingPracticeServiceImpl implements BankingPracticeService {
    @Autowired//银行卡
    AccountBankDataMapper accountBankDataMapper;
    @Autowired//采购出帐详细信息
    AccountBankProcurementInfoDataMapper accountBankProcurementInfoDataMapper;
    @Autowired//进账 详细信息
    AccountBankSellInfoDataMapper accountBankSellInfoDataMapper;

    @Override
    public AccountBankData selectByPrimaryKey_Bank(String id) {
        return accountBankDataMapper.selectByPrimaryKey_Bank(id);
    }

    @Override
    public int updateByPrimaryKey_Bank(AccountBankData record) {
        return accountBankDataMapper.updateByPrimaryKey_Bank(record);
    }

    @Override
    public AccountBankProcurementInfoData selectByPrimaryKey_BPI(String id) {
        return accountBankProcurementInfoDataMapper.selectByPrimaryKey_BPI(id);
    }

    @Override
    public int insert_BPI(AccountBankProcurementInfoData record) {
        return accountBankProcurementInfoDataMapper.insert_BPI(record);
    }

    @Override
    public int updateByPrimaryKey_BPI(AccountBankProcurementInfoData record) {
        return accountBankProcurementInfoDataMapper.updateByPrimaryKey_BPI(record);
    }

    @Override
    public AccountBankSellInfoData selectByPrimaryKey_BSI(String id) {
        return accountBankSellInfoDataMapper.selectByPrimaryKey_BSI(id);
    }

    @Override
    public int insert_BSI(AccountBankSellInfoData record) {
        return accountBankSellInfoDataMapper.insert_BSI(record);
    }

    @Override
    public int updateByPrimaryKey_BSI(AccountBankSellInfoData record) {
        return accountBankSellInfoDataMapper.updateByPrimaryKey_BSI(record);
    }

    @Override
    public Long getTotal_BPI(AccountBankProcurementInfoData_vo abpidv) {
        return accountBankProcurementInfoDataMapper.getTotal_BPI(abpidv);
    }

    @Override
    public List<AccountBankProcurementInfoData_vo> selectAll_BPI(AccountBankProcurementInfoData_vo abpidv) {
        return accountBankProcurementInfoDataMapper.selectAll_BPI(abpidv);
    }

    @Override
    public Long getTotal_BSI(AccountBankSellInfoData_vo abpidv) {
        return accountBankSellInfoDataMapper.getTotal_BSI(abpidv);
    }

    @Override
    public List<AccountBankSellInfoData_vo> selectAll_BSI(AccountBankSellInfoData_vo absid) {
        return accountBankSellInfoDataMapper.selectAll_BSI(absid);
    }
}
