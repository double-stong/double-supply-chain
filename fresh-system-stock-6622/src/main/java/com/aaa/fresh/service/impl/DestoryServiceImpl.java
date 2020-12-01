package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.DestroyedMapper;
import com.aaa.fresh.pojo.DestroyedRegistrationData;
import com.aaa.fresh.service.DestoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestoryServiceImpl implements DestoryService {

    @Autowired
    private DestroyedMapper destroyedMapper;
    @Override
    public Long getTotal(DestroyedRegistrationData destroyData) {
        return destroyedMapper.getTotal(destroyData);
    }

    @Override
    public List<DestroyedRegistrationData> selAllDestroy(DestroyedRegistrationData destroyData) {
        return destroyedMapper.selAllDestroy(destroyData);
    }

    @Override
    public int addDestroy(DestroyedRegistrationData destroyData) {
        return destroyedMapper.addDestroy(destroyData);
    }

    @Override
    public DestroyedRegistrationData selOneDestroy(String id) {
        return destroyedMapper.selOneDestroy(id);
    }

    @Override
    public int updDestroy(DestroyedRegistrationData destroyData) {
        return destroyedMapper.updDestroy(destroyData);
    }

    @Override
    public int delDestroy(String Id) {
        return destroyedMapper.delDestroy(Id);
    }

    @Override
    public int updDestroyById(Integer quantity, String warehouse, String product) {
        return destroyedMapper.updDestroyById(quantity, warehouse, product);
    }
}
