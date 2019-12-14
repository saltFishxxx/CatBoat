package cn.xyh.catboat.model;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "perssion_role")
public class RoleResource {
    private Integer roleId;
    private Integer perssionId;
}
