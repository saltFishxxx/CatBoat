package cn.xyh.catboat.service.impl;

import cn.xyh.catboat.mapper.SysLogMapper;
import cn.xyh.catboat.model.SysLog;
import cn.xyh.catboat.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xyh
 */
@Service
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public void saveLog(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }

    @Override
    public List<SysLog> findAll() {
        return sysLogMapper.selectAll();
    }
}
