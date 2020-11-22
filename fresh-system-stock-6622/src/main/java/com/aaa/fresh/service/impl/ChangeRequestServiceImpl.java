package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.ChangeRequestMapper;
import com.aaa.fresh.pojo.ChangeRequestData;
import com.aaa.fresh.pojo.ChangeRequestTypeData;
import com.aaa.fresh.service.ChangeRequestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChangeRequestServiceImpl implements ChangeRequestService {

    @Resource
    private ChangeRequestMapper changeRequestMapper;


    @Override
    public Long getTotal(ChangeRequestData changeRequestData) {
        return changeRequestMapper.getTotal(changeRequestData);
    }

    @Override
    public List<ChangeRequestData> selAllChangeRequest(ChangeRequestData changeRequestData) {
        return changeRequestMapper.selAllChangeRequest(changeRequestData);
    }

    @Override
    public int addChangeRequest(ChangeRequestData changeRequestData) {
        return changeRequestMapper.addChangeRequest(changeRequestData);
    }

    @Override
    public int delChangeRequest(String Id) {
        return changeRequestMapper.delChangeRequest(Id);
    }

    @Override
    public int updChangeRequest(ChangeRequestData changeRequestData) {
        return changeRequestMapper.updChangeRequest(changeRequestData);
    }

    @Override
    public ChangeRequestData selOneChangeRequest(String Id) {
        return changeRequestMapper.selOneChangeRequest(Id);
    }

    @Override
    public List<ChangeRequestTypeData> selChangeRequestData() {
        return changeRequestMapper.selChangeRequestData();
    }
}
