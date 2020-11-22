package com.aaa.fresh.controller;

import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.pojo.InventoryData;
import com.aaa.fresh.pojo.ProductData;
import com.aaa.fresh.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品管理控制层
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    /**
     * 查询所有的
     * @param productData
     * @return
     */
    @GetMapping("/selAllProduct")
    public CommonResult selAllProduct(ProductData productData){
        //查询总条数
        if (productData.getPage()!=null
                && productData.getSize()!=null){
            productData.setPage((productData.getPage()-1)*
                    productData.getSize());
        }

        Long total = productService.getTotal(productData);
        List<ProductData> productData1 = productService.selAllProduct(productData);

        if (productData1!=null){
            return new CommonResult(200,"查询库存成功",productData1,total);
        }else {
            return new CommonResult(444,"查询库存失败",null,null);

        }
    }

    /**
     * 添加商品
     * @param productData
     * @return
     */
    @PostMapping("/addProduct")
    public CommonResult addProduct(ProductData productData){
        int res = productService.addProduct(productData);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 修改商品
     * @param productData
     * @return
     */
    @PutMapping("/updProduct")
    public CommonResult updProduct(ProductData productData){
        int res = productService.updProduct(productData);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }

    /**
     * 查询单个商品
     * @param id
     * @return
     */
    @GetMapping("/selOneProduct")
    public CommonResult selOneProduct(String id){
        ProductData res = productService.selOneProduct(id);
        if (res!=null){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }


    /**
     * 删除商品
     * @param Id
     * @return
     */
    @DeleteMapping("/delProduct/{Id}")
    public CommonResult delProduct(@PathVariable("Id") String Id){
        int res = productService.delProduct(Id);
        if (res>0){
            return new CommonResult(200,"成功",res,null);
        }else {
            return new CommonResult(444,"失败",null,null);
        }
    }
}
