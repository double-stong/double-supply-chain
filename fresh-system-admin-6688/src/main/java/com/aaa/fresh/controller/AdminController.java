package com.aaa.fresh.controller;

import com.aaa.fresh.pojo.*;
import com.aaa.fresh.service.AdminService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/login")
public class AdminController {
    @Resource
    private AdminService adminService;

    /**
     * 查询用户的登录名和密码
     * @param user
     * @param passworld
     * @return
     */
    @GetMapping("/loginUser")
    public CommonResult<LoginUserVo> loginUser(String user,String passworld){
        LoginUserVo loginUser = adminService.loginUser(user, passworld);
        if (loginUser!=null){
            return new CommonResult<>(200,"成功",loginUser,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 修改账号密码，先验证原有的账户，在进行密码修改
     * @param oldPassworld
     * @param newPassworld
     * @param loginUser
     * @return
     */
    @PutMapping("/updPassworld")
    public CommonResult<Integer> updPassworld(String oldPassworld,String newPassworld,String loginUser){
        String oldpasswd = adminService.selOldPasswprld(loginUser);
        if (oldPassworld != null && oldpasswd.equals(oldPassworld)){
            int res = adminService.updPassworld(oldPassworld, newPassworld, loginUser);
            if (res>0){
                return new CommonResult<>(200,"成功",res,null);
            }else {
                return new CommonResult<>(444,"密码修改失败",null,null);
            }
        }else {
            return new CommonResult<>(555,"原密码与新密码不匹配",null,null);
        }
    }

    /**
     * 根据用户id查询用户相应的角色
     * @param userId
     * @return
     */
    @GetMapping("/selAllRoles/{userId}")
    public CommonResult<List<TbRoles>> selAllRoles(@PathVariable("userId") Integer userId){
        List<TbRoles> tbRoles = adminService.selAllRoles(userId);
        if (tbRoles != null){
            return new CommonResult<>(200,"成功",tbRoles,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 根据用户的角色查询用户的相应功能
     * @param roleId
     * @return
     */
    @GetMapping("/selAllResources/{roleId}")
    public CommonResult<List<TbResources>> selAllResources(@PathVariable("roleId") Integer roleId){
        List<TbResources> res = adminService.selAllResources(roleId);
        if (res!= null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /*===================权限的修改========================*/

    /**
     * 查询出用户的账号，以及用户的职位，以及总条数；
     * @param request
     * @return
     */
    @GetMapping("/selAllLoginUser")
    public CommonResult<List<LoginUserVo>> selAllLoginUser(HttpServletRequest request){
        LoginUser data = JSON.parseObject(request.getParameter("formData"), LoginUser.class);
        if (data.getPage()!= null && data.getSize() != null){
            data.setPage((data.getPage()-1)*data.getSize());
        }
        Long total = adminService.selCountUser(data.getLoginName(), data.getUserRealName());
        List<LoginUserVo> res = adminService.selAllLoginUser(data);
        if (res != null){
            return new CommonResult<>(200,"成功",res,total);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 修改用的的状态，1正常，2，禁用
     * @param userState
     * @param userId
     * @return
     */
    @PutMapping("/updUserState")
    public CommonResult<Integer> updUserState(Integer userState,Integer userId){
        int res = adminService.updUserState(userState, userId);
        if (res>0){
            return  new CommonResult<>(200,"修改成功",res,null);
        }else {
            return new CommonResult<>(444,"修改失败",res,null);
        }
    }

    /**
     * 查询出所有的权限与功能
     * @return
     */
    @GetMapping("/selAllResourceRole")
    public CommonResult<List<TbRolesVo>> selAllResourceRole(){
        List<TbRolesVo> res = adminService.selAllResourceRole();
        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 根据用户的id查询出用户的职务以及功能
     * @param loginName
     * @return
     */
    @GetMapping("/selOneResourceRole")
    public CommonResult<List<TbRolesVo>> selOneResourceRole(String loginName){
        List<TbRolesVo> res = adminService.selOneResourceRole(loginName);
        if (res != null){
            return new CommonResult<>(200,"成功",res,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 删除角色功能中间关系表的
     * @param id
     * @return
     */
    @DeleteMapping("/delResourceRole/{array}")
    public CommonResult<Boolean> delResourceRole(@PathVariable("array")Integer[] roleId){
        log.info("方法一");
        System.out.println(roleId);
        for (Integer a:roleId
             ) {
            log.info(a.toString());
        }
//        boolean res = adminService.delResourceRole(roleId);
        boolean res = true;
        if (res){
            return new CommonResult<>(200,"成功",null,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 删除用户与角色中间表中的内容
     * @param id
     * @return
     */
    @DeleteMapping("/delUserRole/{array}")
    public CommonResult<Boolean> delUserRole(@PathVariable("array") Integer[] id){
        log.info("方法二");
        for (Integer a: id
             ) {
            log.info(a.toString());
        }
        boolean res = adminService.delUserRole(id);
        if (res){
            return new CommonResult<>(200,"成功",null,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     *
     * 添加用户与角色之间的关系表
     * @param userId
     * @param roleId
     * @return
     */
    @PostMapping("/addUSerRole/{arrays}")
    public CommonResult<Boolean> addUSerRole(@PathVariable("arrays")Integer[] allId, Integer userId,Integer[] roleId){
        log.info("方法三");
        for (Integer a:allId
             ) {
            log.info(a.toString());
        }
        boolean res = adminService.addUSerRole(userId, roleId);
        if (res){
            return new CommonResult<>(200,"成功",null,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }

    /**
     * 添加角色和功能之间的关系表
     * @param roleId
     * @param resourceId
     * @return
     */
    @PostMapping("/addResourceRole/{arrays}")
    public CommonResult<Boolean> addResourceRole(Integer roleId,@PathVariable("arrays") Integer[] resourceId){
        log.info("方法四");
        for (Integer i:resourceId
             ) {
            System.out.println(i);
        }
        boolean res = adminService.addResourceRole(roleId, resourceId);
        if (res){
            return new CommonResult<>(200,"成功",null,null);
        }else {
            return new CommonResult<>(444,"失败",null,null);
        }
    }
}
