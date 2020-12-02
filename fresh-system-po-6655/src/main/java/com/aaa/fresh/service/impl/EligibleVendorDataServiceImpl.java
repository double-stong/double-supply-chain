package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.EligibleVendorDataMapper;
import com.aaa.fresh.pojo.EligibleVendorData;
import com.aaa.fresh.service.EligibleVendorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EligibleVendorDataServiceImpl  implements EligibleVendorDataService {
    @Autowired
    EligibleVendorDataMapper eligibleVendorDataMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return eligibleVendorDataMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EligibleVendorData record) {
        return eligibleVendorDataMapper.insert(record);
    }

    @Override
    public int insertSelective(EligibleVendorData record) {
        return eligibleVendorDataMapper.insertSelective(record);
    }

    @Override
    public EligibleVendorData selectByPrimaryKey(String id) {
        return eligibleVendorDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<EligibleVendorData> selectAll(EligibleVendorData elig) {
        return eligibleVendorDataMapper.selectAll(elig);
    }

    @Override
    public int updateByPrimaryKeySelective(EligibleVendorData record) {
        return eligibleVendorDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EligibleVendorData record) {
        return eligibleVendorDataMapper.updateByPrimaryKey(record);
    }
}
