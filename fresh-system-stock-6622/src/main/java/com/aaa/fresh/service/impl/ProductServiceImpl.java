package com.aaa.fresh.service.impl;

import com.aaa.fresh.mapper.ProductMapper;
import com.aaa.fresh.pojo.ProductData;
import com.aaa.fresh.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public Long getTotal(ProductData productData) {
        return productMapper.getTotal(productData);
    }

    @Override
    public List<ProductData> selAllProduct(ProductData productData) {
        return productMapper.selAllProduct(productData);
    }

    @Override
    public int addProduct(ProductData productData) {
        return productMapper.addProduct(productData);
    }

    @Override
    public int delProduct(String Id) {
        return productMapper.delProduct(Id);
    }

    @Override
    public int updProduct(ProductData productData) {
        return productMapper.updProduct(productData);
    }

    @Override
    public ProductData selOneProduct(String Id) {
        return productMapper.selOneProduct(Id);
    }
}
