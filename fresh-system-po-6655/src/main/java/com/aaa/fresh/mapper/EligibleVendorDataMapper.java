package com.aaa.fresh.mapper;


import com.aaa.fresh.pojo.EligibleVendorData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface EligibleVendorDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(EligibleVendorData record);

    int insertSelective(EligibleVendorData record);

    List<EligibleVendorData> selectAll(EligibleVendorData elig);

    EligibleVendorData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EligibleVendorData record);

    int updateByPrimaryKey(EligibleVendorData record);
}