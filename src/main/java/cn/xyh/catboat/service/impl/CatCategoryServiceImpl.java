package cn.xyh.catboat.service.impl;

import cn.xyh.catboat.mapper.CatCategoryMapper;
import cn.xyh.catboat.model.CatCategory;
import cn.xyh.catboat.service.ICatCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CatCategoryServiceImpl implements ICatCategoryService {

    @Autowired
    private CatCategoryMapper catCategoryMapper;

    @Override
    public void add(CatCategory catCategory) {
        catCategoryMapper.insertSelective(catCategory);
    }

    @Override
    public void delete(Integer id) {
        catCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CatCategory findOne(Integer id) {
        return catCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CatCategory> findAll() {
        return catCategoryMapper.findAll();
    }

    @Override
    public void update(CatCategory catCategory) {
        catCategoryMapper.updateByPrimaryKeySelective(catCategory);
    }
}
