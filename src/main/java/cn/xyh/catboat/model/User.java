package cn.xyh.catboat.model;

import lombok.Data;
import java.util.List;

@Data
public class User {
    private Integer userId;
    private String userName;
    private String userPass;
    private List<AdminRole> adminRoleList;
}
