package com.aaa.fresh.service;

import com.aaa.fresh.mapper.AdminMapper;
import com.aaa.fresh.pojo.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Resource
    private AdminMapper mapper;
    @Override
    public LoginUserVo loginUser(String user, String password) {
        return mapper.loginUser(user, password);
    }

    @Override
    public List<TbRoles> selAllRoles(Integer userId) {
        return mapper.selAllRoles(userId);
    }

    @Override
    public List<TbResources> selAllResources(Integer roleId) {
        return mapper.selAllResources(roleId);
    }

    @Override
    public int updPassworld(String oldPassworld, String newPassworld, String loginUser) {
        return mapper.updPassworld(oldPassworld, newPassworld, loginUser);
    }

    @Override
    public String selOldPasswprld(String usename) {
        return mapper.selOldPasswprld(usename);
    }

    @Override
    public Long selCountUser(String loginName, String userRealName) {
        return mapper.selCountUser(loginName,userRealName);
    }

    @Override
    public List<LoginUserVo> selAllLoginUser(LoginUser loginUser) {
        return mapper.selAllLoginUser(loginUser);
    }

    @Override
    public int updUserState(Integer userState, Integer userId) {
        return mapper.updUserState(userState, userId);
    }

    @Override
    public List<TbRolesVo> selAllResourceRole() {
        return mapper.selAllResourceRole();
    }

    @Override
    public List<TbRolesVo> selOneResourceRole(String userId) {
        return mapper.selOneResourceRole(userId);
    }

    @Override
    public boolean delResourceRole(Integer[] ResourceRoleId) {
        boolean flag = true;
        for (Integer id: ResourceRoleId){
            mapper.delResourceRole(id);
        }
        return flag;
    }

    @Override
    public boolean delUserRole(Integer[] userRoleId) {
        boolean flag = true;
        for (Integer id: userRoleId){
            mapper.delUserRole(id);
        }
        return flag;
    }

    @Override
    public boolean addUSerRole(Integer userId, Integer[] roleId) {
        boolean flag = true;
        for (Integer id: roleId
             ) {
            mapper.addUSerRole(userId,id);
        }
        return flag;
    }

    @Override
    public boolean addResourceRole(Integer roleId, Integer[] resourceId) {
        boolean flag = true;
        for (Integer id: resourceId
             ) {
            mapper.addResourceRole(roleId,id);
        }
        return flag;
    }
}
