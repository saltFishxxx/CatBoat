package cn.xyh.catboat.service.impl;

import cn.xyh.catboat.mapper.AdminRoleMapper;
import cn.xyh.catboat.mapper.PersionRoleMapper;
import cn.xyh.catboat.model.AdminPerssion;
import cn.xyh.catboat.model.AdminRole;
import cn.xyh.catboat.model.RoleResource;
import cn.xyh.catboat.service.IAdminRoleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class AmidnRoleServiceImpl implements IAdminRoleService {

    @Autowired
    private AdminRoleMapper adminRoleMapper;

    @Autowired
    private PersionRoleMapper persionRoleMapper;

    @Override
    public void deleteRole(Integer id) {
        adminRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addRole(AdminRole adminRole) {
        adminRoleMapper.insertSelective(adminRole);
    }

    @Override
    public List<AdminRole> findAll(int page, int size) {
        PageHelper.startPage(page, size);
        return adminRoleMapper.selectAll();
    }

    @Override
    public List<AdminPerssion> findOtherRersources(Integer roleId) {
        return adminRoleMapper.findNotAddResource(roleId);
    }

    @Override
    public void addRoleResource(Integer roleId, Integer resourceId) {
        RoleResource roleResource = new RoleResource();
        roleResource.setRoleId(roleId);
        roleResource.setPerssionId(resourceId);
        persionRoleMapper.insertSelective(roleResource);
    }

    @Override
    public AdminRole findAllRoleAndResource(Integer roleId) {
        AdminRole adminRole = adminRoleMapper.selectByPrimaryKey(roleId);
        adminRole.setAdminPerssionList(adminRoleMapper.findResourcesByRoleId(roleId));
        return adminRole;
    }
}
