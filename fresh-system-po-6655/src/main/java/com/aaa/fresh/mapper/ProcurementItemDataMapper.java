package com.aaa.fresh.mapper;

import com.aaa.fresh.pojo.ProcurementItemData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProcurementItemDataMapper {
    //查询总条数
    Long allTotal(ProcurementItemData procurementItemData);
    List<ProcurementItemData> selectAll(ProcurementItemData procurementItemData);

    int insert (List<ProcurementItemData> ps);
    int update(ProcurementItemData procurementItemData);

}
