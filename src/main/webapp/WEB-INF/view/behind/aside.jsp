<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>侧边</title>
</head>
<body>
    <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="../img/head.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${userName}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>
        <!-- search form -->
        <!--<form action="#" method="get" class="sidebar-form">
    <div class="input-group">
        <input type="text" name="q" class="form-control" placeholder="搜索...">
        <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
    </div>
</form>-->
        <!-- /.search form -->


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>
            <li id="admin-index"><a href="${pageContext.request.contextPath}/admin/toIndex.do"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>
            <!-- 菜单 -->
            <li class="treeview">
                <a href="#">
                    <i class="fa  fa-user"></i> <span>用户管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-role">
                        <a href="${pageContext.request.contextPath}/userManager/toAdminRolePage.do">
                            <i class="fa fa-circle-o"></i> 角色管理
                        </a>
                    </li>

                    <li id="admin-resource">
                        <a href="${pageContext.request.contextPath}/userManager/toAdminResourcesPage.do">
                            <i class="fa fa-circle-o"></i> 资源管理
                        </a>
                    </li>

                    <li id="admin-add">
                        <a href="${pageContext.request.contextPath}/admin/toAddPage.do">
                            <i class="fa fa-circle-o"></i> 添加管理员
                        </a>
                    </li>

                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-github"></i> <span>猫管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-cat-category">
                        <a href="${pageContext.request.contextPath}/category/toIndexPage.do">
                            <i class="fa fa-circle-o"></i> 猫种类
                        </a>
                    </li>

                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-check-circle"></i> <span>审核申请</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-find-host">
                        <a href="${pageContext.request.contextPath}/admin/toIndex.do">
                            <i class="fa fa-circle-o"></i> 寻主
                        </a>
                    </li>
                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-graduation-cap"></i> <span>猫咪百科</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-news-upload">
                        <a href="${pageContext.request.contextPath}/news/toNewsPage.do">
                            <i class="fa fa-circle-o"></i> 文章上传
                        </a>
                    </li>
                </ul>
            </li>

            <li id="admin-index"><a href="${pageContext.request.contextPath}/log/findAllLogs.do"><i class="fa  fa-file-text-o"></i> <span>操作记录</span></a></li>

            <li id="admin-index"><a href="${pageContext.request.contextPath}/advice/findAll.do"><i class="fa  fa-envelope"></i> <span>意见反馈</span></a></li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
</body>
</html>
