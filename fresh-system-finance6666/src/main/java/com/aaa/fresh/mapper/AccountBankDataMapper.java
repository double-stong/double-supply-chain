package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.AccountBankData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AccountBankDataMapper {
    //查询一个银行卡
    AccountBankData selectByPrimaryKey_Bank(String id);

    //资产上升或下降
    int updateByPrimaryKey_Bank(AccountBankData record);

}