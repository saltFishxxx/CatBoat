package cn.xyh.catboat.service;

import cn.xyh.catboat.dao.IAdminDao;
import cn.xyh.catboat.exception.UserException;
import cn.xyh.catboat.model.Admin;
import org.springframework.stereotype.Service;

/**
 * @author xyh
 */
public interface IAdminService {
    public boolean login(Admin admin);
    public void saveAdmin(Admin admin) throws UserException;
    public void updatePassword(Admin admin);
}
