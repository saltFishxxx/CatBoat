package cn.xyh.catboat.dao.impl;

import cn.xyh.catboat.dao.IUserDao;
import cn.xyh.catboat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author xyh
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findUserById(Integer id) {
        String sql = "select * from edu_user where user_id = ?";
        User user = null;
        try {
           user =  jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        }catch (Exception e) {

        }
        return user;
    }

    //根据名字获得当前用户的全部信息
    @Override
    public User findUserByName(String userName) {
        String sql = "select * from cat_user where user_name = ?";
        User user = null;
        try {
            user = jdbcTemplate.queryForObject(sql, User.class, userName);
        }catch (Exception e) {

        }
        return user;
    }

    @Override
    public void saveUser(User user) {
        String sql = "insert into cat_admin(admin_name, admin_password) values(?,?)";
        jdbcTemplate.update(sql, user.getUserName(), user.getUserPass());
    }

}
