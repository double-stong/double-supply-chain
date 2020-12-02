package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.ProcurementItemDataMapper;
import com.aaa.fresh.mapper.ProcurementRequirementDataMapper;
import com.aaa.fresh.pojo.ProcurementRequirementData;
import com.aaa.fresh.pojo.ProcurementRequirementDataVo;
import com.aaa.fresh.pojo.ReturnObj;
import com.aaa.fresh.service.ProcurementRequirementDataService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcurementRequirementDataServiceImpl implements ProcurementRequirementDataService {
    @Autowired
    ProcurementRequirementDataMapper procurementRequirementDataMapper;
    @Autowired
    ProcurementItemDataMapper procurementItemDataMapper;
    @Override
    public Long allTotal(ProcurementRequirementData procurementRequirementData) {
        return procurementRequirementDataMapper.allTotal(procurementRequirementData);
    }

    @Override
    public ReturnObj selectAll(ProcurementRequirementData pro) {
        int currentPage = pro.getPage() == null ? 1:pro.getPage();
        int pageSize = pro.getSize() == null ? 3:pro.getSize();
        PageHelper.startPage(currentPage,pageSize);
        List<ProcurementRequirementData> ps = procurementRequirementDataMapper.selectAll(pro);
        PageInfo<ProcurementRequirementData> pageinfo = new PageInfo<ProcurementRequirementData>(ps);
        Integer total = Integer.valueOf(pageinfo.getTotal()+"");
        List<ProcurementRequirementData> list = pageinfo.getList();
        return new ReturnObj(0,"",total,list);

    }

    @Override
    public int insert(ProcurementRequirementDataVo prvo) {
        if (procurementRequirementDataMapper.insert(prvo.getPro())  > 0 && procurementItemDataMapper.insert(prvo.getItems()) > 0) {
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int update(ProcurementRequirementData procurementRequirementData) {
        return procurementRequirementDataMapper.update(procurementRequirementData);
    }
}
