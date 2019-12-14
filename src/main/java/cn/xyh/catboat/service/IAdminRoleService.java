package cn.xyh.catboat.service;

import cn.xyh.catboat.model.AdminPerssion;
import cn.xyh.catboat.model.AdminRole;

import java.util.List;

public interface IAdminRoleService {
    public void deleteRole(Integer id);
    public void addRole(AdminRole adminRole);
    public List<AdminRole> findAll(int page, int size);
    public List<AdminPerssion> findOtherRersources(Integer roleId);
    public void addRoleResource(Integer roleId, Integer resourceId);
    public AdminRole findAllRoleAndResource(Integer roleId);
}
