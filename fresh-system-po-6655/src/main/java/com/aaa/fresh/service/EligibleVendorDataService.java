package com.aaa.fresh.service;

import com.aaa.fresh.pojo.EligibleVendorData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EligibleVendorDataService {
    int deleteByPrimaryKey(String id);

    int insert(EligibleVendorData record);

    int insertSelective(EligibleVendorData record);

    EligibleVendorData selectByPrimaryKey(String id);

    List<EligibleVendorData> selectAll(EligibleVendorData elig);


    int updateByPrimaryKeySelective(EligibleVendorData record);

    int updateByPrimaryKey(EligibleVendorData record);
}
