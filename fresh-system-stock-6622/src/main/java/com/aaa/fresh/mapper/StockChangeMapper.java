package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.StockChangeData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 库存变化;;;;未写；；
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
    int delStockChange(Integer Id);
    //修改
    int updStockChange(StockChangeData stockChangeData);
    /*============================库存事件变化检入==========================*/


    /*============================库存变化事件检验==========================*/
    /*============================库存变化项目=============================*/
}
