package com.aaa.fresh.service;

import com.aaa.fresh.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminService {
    //登陆
    LoginUserVo loginUser(@Param("user") String user, @Param("password") String password);
    //用户登录之可以获取到用户的id；根据用户的id查询用户相应的角色
    List<TbRoles> selAllRoles(Integer userId);
    //根据用户的角色查询用户的功能
    List<TbResources> selAllResources(Integer roleId);


    //修改密码
    int updPassworld(String oldPassworld,String newPassworld,String loginUser);
    //根据登陆名查询原来的密码
    String selOldPasswprld(String usename);


    //权限管理
    //查询出总条数
    Long selCountUser(@Param("loginName") String loginName,@Param("userRealName") String userRealName);
    //查询出用户和他的权限；
    List<LoginUserVo> selAllLoginUser(LoginUser loginUser);
    //修改账户的状态
    int updUserState(@Param("userState") Integer userState,@Param("userId") Integer userId);
    //查询出所有的职务菜单
    List<TbRolesVo> selAllResourceRole();
    //根据用户查询出他的职位以及功能
    List<TbRolesVo> selOneResourceRole(@Param("userId") String userId);
    //循环删除中间职务表中的内容
    boolean delResourceRole(Integer[] ResourceRoleId);
    //删除用户功能中间表
    boolean delUserRole(Integer[] userRoleId);
    //添加用户角色中间表
    boolean addUSerRole(Integer userId,Integer[] roleId);
    //添加用户角色功能中间表
    boolean addResourceRole(Integer roleId,Integer[] resourceId);
}
