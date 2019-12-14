package cn.xyh.catboat.service;

import cn.xyh.catboat.model.CatCategory;

import java.util.List;

public interface ICatCategoryService {
    void add(CatCategory  catCategory);
    void delete(Integer id);
    CatCategory findOne(Integer id);
    List<CatCategory> findAll();
    void update(CatCategory catCategory);
}
