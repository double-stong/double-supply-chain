package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.ProcurementRequirementData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface ProcurementRequirementDataMapper {
    //查询总条数
    Long allTotal(ProcurementRequirementData procurementRequirementData);
    List<ProcurementRequirementData> selectAll(ProcurementRequirementData procurementRequirementData);
    int insert (ProcurementRequirementData procurementRequirementData);
    int update(ProcurementRequirementData procurementRequirementData);
}
