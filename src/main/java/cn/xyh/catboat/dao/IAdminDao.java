package cn.xyh.catboat.dao;

import cn.xyh.catboat.model.Admin;
import cn.xyh.catboat.model.User;

import java.util.List;

/**
 * @author xyh
 */
public interface IAdminDao {
    public Admin login(Admin admin);
    public void saveAdmin(Admin admin) throws Exception;
    public void updatePassword(Admin admin);
}
