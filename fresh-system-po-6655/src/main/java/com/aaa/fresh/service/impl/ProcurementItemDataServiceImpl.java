package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.ProcurementItemDataMapper;
import com.aaa.fresh.pojo.ProcurementItemData;
import com.aaa.fresh.service.ProcurementItemDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcurementItemDataServiceImpl implements ProcurementItemDataService {
    @Autowired
    ProcurementItemDataMapper procurementItemDataMapper;
    @Override
    public Long allTotal(ProcurementItemData procurementItemData) {
        return procurementItemDataMapper.allTotal(procurementItemData);
    }

    @Override
    public List<ProcurementItemData> selectAll(ProcurementItemData procurementItemData) {
        return procurementItemDataMapper.selectAll(procurementItemData);
    }

    @Override
    public int insert(List<ProcurementItemData> list) {
            return procurementItemDataMapper.insert(list);
    }

    @Override
    public int update(ProcurementItemData procurementItemData) {
        return procurementItemDataMapper.update(procurementItemData);
    }
}
