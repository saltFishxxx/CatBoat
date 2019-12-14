package cn.xyh.catboat.service.impl;

import cn.xyh.catboat.mapper.AdminPerssionMapper;
import cn.xyh.catboat.model.AdminPerssion;
import cn.xyh.catboat.service.IAdminResourcesService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author xyh
 */
@Service
public class AdminResourceServiceImpl implements IAdminResourcesService {

    @Autowired
    private AdminPerssionMapper adminPerssionMapper;

    @Override
    public void deleteResource(Integer id) {

        adminPerssionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addResource(AdminPerssion adminPerssion) {
        adminPerssionMapper.insertSelective(adminPerssion);
    }

    @Override
    public List<AdminPerssion> findAll(int page, int size) {
        PageHelper.startPage(page, size);
        return adminPerssionMapper.selectAll();
    }
}
