package cn.xyh.catboat.service;

import cn.xyh.catboat.model.AdminRole;

import java.util.List;

/**
 * @author xyh
 */
public interface IUserManagerService {
    List<AdminRole> findAll();

}
