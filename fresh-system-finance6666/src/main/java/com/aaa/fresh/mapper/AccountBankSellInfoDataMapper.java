package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.AccountBankSellInfoData;
import com.aaa.fresh.pojo.AccountBankSellInfoData_vo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AccountBankSellInfoDataMapper {
    //查询总条数  分页
    Long getTotal_BSI(AccountBankSellInfoData_vo abpidv);
    //查询所有 销售入账详细信息
    List<AccountBankSellInfoData_vo> selectAll_BSI(AccountBankSellInfoData_vo absid);


    //查询一个进账详细信息
    AccountBankSellInfoData selectByPrimaryKey_BSI(String id);
    //添加进账详细信息
    int insert_BSI(AccountBankSellInfoData record);
    //修改进账详细信息
    int updateByPrimaryKey_BSI(AccountBankSellInfoData record);
}