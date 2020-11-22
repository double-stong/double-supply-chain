package com.aaa.fresh.service;

import com.aaa.fresh.pojo.ProductData;

import java.util.List;

public interface ProductService {
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
