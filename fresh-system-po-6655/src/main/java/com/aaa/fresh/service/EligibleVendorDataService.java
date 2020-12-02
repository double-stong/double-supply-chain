package com.aaa.fresh.service;

import com.aaa.fresh.pojo.EligibleVendorData;

import java.util.List;

public interface EligibleVendorDataService {
    int deleteByPrimaryKey(String id);

    int insert(EligibleVendorData record);

    int insertSelective(EligibleVendorData record);

    EligibleVendorData selectByPrimaryKey(String id);

    List<EligibleVendorData> selectAll(EligibleVendorData elig);


    int updateByPrimaryKeySelective(EligibleVendorData record);

    int updateByPrimaryKey(EligibleVendorData record);
}
