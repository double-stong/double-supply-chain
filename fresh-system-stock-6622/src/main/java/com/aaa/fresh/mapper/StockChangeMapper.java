package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.StockChangeData;
import com.aaa.fresh.pojo.StockChangeDirectionData;
import com.aaa.fresh.pojo.StockChangeItemData;
import com.aaa.fresh.pojo.StockChangeTypeData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 库存变化；；
 */
@Mapper
@Component
public interface StockChangeMapper {
    /*===========================库存变化===========================*/
    //分页查询
    Long getTotal(StockChangeData stockChangeData);
    //查询所有的
    List<StockChangeData> selAllStockChange(StockChangeData stockChangeData);
    //查询单个
    StockChangeData selOneStockChange(String Id);
    //添加
    int addStockChange(StockChangeData stockChangeData);
    //删除
    int delStockChange(String Id);
    //修改
    int updStockChange(StockChangeData stockChangeData);
    //查询库存变化的方向  入库、、出库
    List<StockChangeDirectionData> selAllDirectinon();
    //库存变化类型  盘点入库  报废入库  退货入库
    List<StockChangeTypeData> selAllChangeType();

    //根据引用id查询库存变化的详细信息
    StockChangeItemData selChangeItemById(String Id);

    //修改出入库的状态 默认为0 为未领取  修改值为1 状态为 已领取 减少库存
    int updChangeItemVersion(@Param("Id") String Id,@Param("version") Integer version);
}
