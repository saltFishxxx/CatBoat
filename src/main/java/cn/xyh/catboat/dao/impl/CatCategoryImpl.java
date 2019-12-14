package cn.xyh.catboat.dao.impl;

import cn.xyh.catboat.dao.ICatCategory;
import cn.xyh.catboat.model.CatCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CatCategoryImpl implements ICatCategory {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CatCategory> findAll() {
        String sql = "select category_id,category_name,category_body,category_hair from cat_category";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<CatCategory>(CatCategory.class));
    }
}
