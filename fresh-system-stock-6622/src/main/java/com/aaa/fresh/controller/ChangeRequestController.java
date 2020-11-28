package com.aaa.fresh.controller;

import com.aaa.fresh.pojo.ChangeRequestData;
import com.aaa.fresh.pojo.ChangeRequestTypeData;
import com.aaa.fresh.pojo.CommonResult;
import com.aaa.fresh.service.ChangeRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/stock")
public class ChangeRequestController {

    @Resource
    private ChangeRequestService requestService;


    /**
     * 查询所有的改变事件信息
     * @param changeRequestData
     * @return
     */
    @GetMapping("/selAllChangeRequest")
    public CommonResult<List<ChangeRequestData>> selAllChangeRequest(ChangeRequestData changeRequestData){

        if (changeRequestData.getPage()!=null
                && changeRequestData.getSize()!=null){
            changeRequestData.setPage((changeRequestData.getPage()-1)*
                    changeRequestData.getSize());
        }

        Long total = requestService.getTotal(changeRequestData);

        List<ChangeRequestData> res = requestService.selAllChangeRequest(changeRequestData);
        if (res!= null){
            return new CommonResult<>(200,"成功",res,total);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }

    }

    /**
     * 添加信息
     * @param changeRequestData
     * @return
     */
    @PostMapping("/addChangeRequest")
    public CommonResult<Integer> addChangeRequest(ChangeRequestData changeRequestData){
        int res = requestService.addChangeRequest(changeRequestData);
        if (res>0){
            return  new CommonResult<>(200,"成功",res,null);
        }else {
            return  new CommonResult<>(444,"失败",null,null);

        }
    }

    /**
     * 删除
     * @param Id
     * @return
     */
    @DeleteMapping("/delChangeRequest/{Id}")
    public CommonResult<Integer> delChangeRequest(@PathVariable("Id") String Id){
        int res = requestService.delChangeRequest(Id);
        if (res>0){
            return  new CommonResult<>(200,"成功",res,null);
        }else {
            return  new CommonResult<>(444,"失败",null,null);

        }
    }


    /**
     * 修改
     * @param changeRequestData
     * @return
     */
    @PutMapping("/updChangeRequest")
    public CommonResult<Integer> updChangeRequest(ChangeRequestData changeRequestData){
        int res = requestService.updChangeRequest(changeRequestData);
        if (res>0){
            return  new CommonResult<>(200,"成功",res,null);
        }else {
            return  new CommonResult<>(444,"失败",null,null);

        }
    }

    /**
     * 查询单个
     * @param Id
     * @return
     */
    @GetMapping("/selOneChangeRequest/{Id}")
    public CommonResult<ChangeRequestData> selOneChangeRequest(@PathVariable("Id") String Id){
        ChangeRequestData res = requestService.selOneChangeRequest(Id);
        if (res!=null){
            return new CommonResult<ChangeRequestData>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 查询所有的请求类型
     * @return
     */
    @GetMapping("/selChangeRequestData")
    public CommonResult<List<ChangeRequestTypeData>> selChangeRequestData(){
        List<ChangeRequestTypeData> res = requestService.selChangeRequestData();
        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }


}
