package cn.xyh.catboat.dao;

import cn.xyh.catboat.model.User;

public interface IUserDao {
    User findUserById(Integer id);
    User findUserByName(String userName);
    void saveUser(User user);
}
