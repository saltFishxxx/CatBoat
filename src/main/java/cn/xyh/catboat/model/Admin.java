package cn.xyh.catboat.model;

import cn.xyh.catboat.util.Md5Util;
import lombok.Data;


@Data
public class Admin {
    private Integer adminId;
    private String adminName;
    private String adminPassword;
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = Md5Util.encodeByMd5(adminPassword);
    }
}