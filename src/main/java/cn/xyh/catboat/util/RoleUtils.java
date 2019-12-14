package cn.xyh.catboat.util;

import cn.xyh.catboat.model.AdminRole;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色工具类
 */
public class RoleUtils {
    private RoleUtils() {}

    public static List<SimpleGrantedAuthority> coverAuthority(List<AdminRole> adminRole) {
        ArrayList<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<SimpleGrantedAuthority>();
        for (AdminRole role : adminRole) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority("ROLE"+role.getRoleName()));
        }
        return simpleGrantedAuthorities;
    }
}
