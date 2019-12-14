package cn.xyh.catboat.dao.impl;

import cn.xyh.catboat.dao.IAdminDao;
import cn.xyh.catboat.model.Admin;
import cn.xyh.catboat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDaoImpl implements IAdminDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Admin login(Admin admin) {
        String sql = "select * from cat_admin where admin_name = ? and admin_password = ?";
        Admin sqlAdmin = null;
        try {
            sqlAdmin = jdbcTemplate.queryForObject(sql,
                    new BeanPropertyRowMapper<Admin>(Admin.class),
                    admin.getAdminName(), admin.getAdminPassword());
        } catch (DataAccessException e) {

        }
        return sqlAdmin;
    }

    @Override
    public void saveAdmin(Admin admin) throws Exception {
        String sql = "insert into cat_admin(admin_name, admin_password) values(?,?)";
        jdbcTemplate.update(sql, admin.getAdminName(), admin.getAdminPassword());
    }

    @Override
    public void updatePassword(Admin admin) {
        String sql = "update cat_admin set admin_password = ? where admin_name = ?";
        jdbcTemplate.update(sql, admin.getAdminPassword(), admin.getAdminName());
    }
}
