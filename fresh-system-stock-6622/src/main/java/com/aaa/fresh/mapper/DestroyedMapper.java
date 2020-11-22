package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.DestroyedRegistrationData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 损耗登记管理
 */
@Mapper
@Component
public interface DestroyedMapper {
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
    int delDestroy(String  Id);

}
