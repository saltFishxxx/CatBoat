package cn.xyh.catboat.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@Table(name = "admin_perssion")
public class AdminPerssion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer perssionId;
    private String perssionName;
    private String perssionUrl;
    private List<AdminRole> adminRoleList;
}
