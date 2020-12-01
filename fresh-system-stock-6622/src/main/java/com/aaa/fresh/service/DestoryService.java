package com.aaa.fresh.service;

import com.aaa.fresh.pojo.DestroyedRegistrationData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DestoryService {
    //查询损耗数量
    Long getTotal(DestroyedRegistrationData destroyData);
    //查询损耗全部
    List<DestroyedRegistrationData> selAllDestroy(DestroyedRegistrationData destroyData);
    //添加损耗登记
    int addDestroy(DestroyedRegistrationData destroyData);
    //查询单个损耗记录
    DestroyedRegistrationData selOneDestroy(String id);
    //修改损耗登记
    int updDestroy(DestroyedRegistrationData destroyData);
    //删除损耗登记
    int delDestroy(String Id);
    //损耗登记成功，根据仓库信息以及商品信息减少相应的库存 商品 仓库  数量
    int updDestroyById(Integer quantity, String warehouse, String product);
}
