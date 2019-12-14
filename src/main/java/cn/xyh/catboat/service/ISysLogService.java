package cn.xyh.catboat.service;

import cn.xyh.catboat.model.SysLog;

import java.util.List;

public interface ISysLogService {
    public void saveLog(SysLog sysLog);
    public List<SysLog> findAll();
}
