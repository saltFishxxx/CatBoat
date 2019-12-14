package cn.xyh.catboat.controller;

import cn.xyh.catboat.model.SysLog;
import cn.xyh.catboat.service.ISysLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Component
public class MyAspect {
    @Autowired
    private ISysLogService iSysLogService;

    @Autowired(required = false)
    private HttpServletRequest httpServletRequest;

    private Date visitTime;
    /**
     *  给controller添加前置通知
     */
    @Before("execution(* cn.xyh.catboat.controller.*.*(..))")
    public void doBefore(JoinPoint joinPoint) {
        //访问时间
        visitTime = new Date();
        //获取方法名
        System.out.println(joinPoint.getSignature().getName());
        //获取类
        System.out.println(joinPoint.getTarget().getClass());
    }

    /**
     * 给controller添加后置通知
     * @param joinPoint
     */
    @After("execution(* cn.xyh.catboat.controller.*.*(..)))")
    public void doAfter(JoinPoint joinPoint) {
        //获取访问的uri
        String uri = httpServletRequest.getRequestURI();

        if (uri != null && uri.length()!=0 && !uri.contains("/log")) {
            if (  uri.contains("/userManager")
                    || uri.contains("/category")
                    || uri.contains("/news")
                    || uri.contains("/advice")
                    || uri.contains("/admin/toIndex.do")) {

                SysLog sysLog = new SysLog();
                //获取远程访问地址
                String ip = httpServletRequest.getRemoteAddr();
                System.out.println(uri);
                if (uri.contains("/userManager")) {
                    sysLog.setLogVisitname("用户管理");
                }else if(uri.contains("/category")) {
                    sysLog.setLogVisitname("猫管理");
                }else if(uri.contains("/news")) {
                    sysLog.setLogVisitname("猫咪百科");
                }else if(uri.contains("/advice")) {
                    sysLog.setLogVisitname("意见反馈");
                }else if(uri.contains("/admin/toIndex.do")) {
                    sysLog.setLogVisitname("审核申请");
                }

                //获取访问的名字
                String username = (String) httpServletRequest.getSession().getAttribute("userName");

                //获取访问时间
                long executionTime = System.currentTimeMillis() - visitTime.getTime();

                //进行封装
                sysLog.setLogIp(ip);
                sysLog.setLogExecutiontime(executionTime);
                sysLog.setLogUsername(username);
                sysLog.setLogVisittime(visitTime);

                iSysLogService.saveLog(sysLog);
            }
        }
    }
}
