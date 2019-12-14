package cn.xyh.catboat.mapper;

import cn.xyh.catboat.model.AdminPerssion;
import cn.xyh.catboat.model.AdminRole;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author xyh
 */
public interface AdminRoleMapper extends Mapper<AdminRole> {
    public List<AdminPerssion> findNotAddResource(Integer roleId);
    public List<AdminPerssion> findResourcesByRoleId(Integer roleId);
}
