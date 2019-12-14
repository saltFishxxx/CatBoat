package cn.xyh.catboat.service;

import cn.xyh.catboat.model.AdminPerssion;
import java.util.List;

public interface IAdminResourcesService {
    public void deleteResource(Integer id);
    public void addResource(AdminPerssion adminPerssion);
    public List<AdminPerssion> findAll(int page, int size);
}
