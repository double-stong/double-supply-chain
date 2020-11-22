package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.ChangeRequestData;
import com.aaa.fresh.pojo.ChangeRequestTypeData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 变更请求
 */
@Mapper
@Component
public interface ChangeRequestMapper {
    //分页查询
    Long getTotal(ChangeRequestData changeRequestData);
    //查询所有
    List<ChangeRequestData> selAllChangeRequest(ChangeRequestData changeRequestData);
    //添加
    int addChangeRequest(ChangeRequestData changeRequestData);
    //删除
    int delChangeRequest(String Id);
    //修改
    int updChangeRequest(ChangeRequestData changeRequestData);
    //查询单个
    ChangeRequestData selOneChangeRequest(String Id);

    /*===========================请求类型查询==============================*/

    //查询所有的请求类型
    List<ChangeRequestTypeData> selChangeRequestData();

}
