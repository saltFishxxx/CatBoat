package cn.xyh.catboat.mapper;

import cn.xyh.catboat.model.CatCategory;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CatCategoryMapper extends Mapper<CatCategory> {
    List<CatCategory> findAll();
}
