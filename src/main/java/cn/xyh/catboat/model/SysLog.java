package cn.xyh.catboat.model;

import cn.xyh.catboat.util.DateUtil;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "sys_log")
public class SysLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId; //定义id同时自增长

    //访问时间
    private Date logVisittime;
    @Transient
    private String strLogVisttime;

    private Long logExecutiontime;
    private String logUsername;
    private String logIp;
    private String logVisitname;


    public void setLogVisittime(Date date) {
        this.logVisittime = date;
        this.strLogVisttime = DateUtil.dateToString(date);
    }
}
