package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.ProcurementRequirementDataMapper;
import com.aaa.fresh.pojo.ProcurementRequirementData;
import com.aaa.fresh.service.ProcurementRequirementDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProcurementRequirementDataServiceImpl implements ProcurementRequirementDataService {
    @Autowired
    ProcurementRequirementDataMapper procurementRequirementDataMapper;
    @Override
    public Long allTotal(ProcurementRequirementData procurementRequirementData) {
        return procurementRequirementDataMapper.allTotal(procurementRequirementData);
    }

    @Override
    public List<ProcurementRequirementData> selectAll(ProcurementRequirementData procurementRequirementData) {
        return procurementRequirementDataMapper.selectAll(procurementRequirementData);
    }

    @Override
    public int insert(ProcurementRequirementData procurementRequirementData) {
        return procurementRequirementDataMapper.insert(procurementRequirementData);
    }

    @Override
    public int update(ProcurementRequirementData procurementRequirementData) {
        return procurementRequirementDataMapper.update(procurementRequirementData);
    }
}
