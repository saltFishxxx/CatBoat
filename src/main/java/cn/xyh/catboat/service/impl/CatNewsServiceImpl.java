package cn.xyh.catboat.service.impl;

import cn.xyh.catboat.mapper.CatNewsMapper;
import cn.xyh.catboat.model.AdminNews;
import cn.xyh.catboat.service.ICatNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatNewsServiceImpl implements ICatNewsService {

    @Autowired
    private CatNewsMapper catNewsMapper;

    @Override
    public void saveNews(AdminNews adminNews) {
        catNewsMapper.insertSelective(adminNews);
    }
}
