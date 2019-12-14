package cn.xyh.catboat.service.impl;

import cn.xyh.catboat.dao.IAdminDao;
import cn.xyh.catboat.dao.IUserDao;
import cn.xyh.catboat.mapper.AdminRoleMapper;
import cn.xyh.catboat.model.Admin;
import cn.xyh.catboat.model.AdminRole;
import cn.xyh.catboat.model.User;
import cn.xyh.catboat.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    @Autowired
    private AdminRoleMapper adminRoleMapper;

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }
}
