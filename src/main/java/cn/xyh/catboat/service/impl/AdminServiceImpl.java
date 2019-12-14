package cn.xyh.catboat.service.impl;

import cn.xyh.catboat.dao.IAdminDao;
import cn.xyh.catboat.exception.UserException;
import cn.xyh.catboat.model.Admin;
import cn.xyh.catboat.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xyh
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private IAdminDao iAdminDao;

    @Override
    public boolean login(Admin admin) {
        boolean flag = false;
        if (iAdminDao.login(admin) != null) {
            flag = true;
        }
        return flag;
    }

    @Override
    public void saveAdmin(Admin admin) throws UserException {
        try {
            iAdminDao.saveAdmin(admin);
        } catch (Exception e) {
            throw new UserException("用户名已存在");
        }
    }

    @Override
    public void updatePassword(Admin admin) {
        iAdminDao.updatePassword(admin);
    }
}
