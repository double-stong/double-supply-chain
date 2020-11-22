package com.aaa.fresh.mapper;


import com.aaa.fresh.pojo.ProductData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品信息
 */
@Mapper
@Component
public interface ProductMapper {
    //查询数量
    Long getTotal(ProductData productData);
    //查询商品
    List<ProductData> selAllProduct(ProductData productData);
    //添加商品
    int addProduct(ProductData productData);
    //删除商品
    int delProduct(String Id);
    //修改商品
    int updProduct(ProductData productData);
    //根据商品的id查询商品单个信息
    ProductData selOneProduct(String Id);
}
