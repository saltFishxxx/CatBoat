<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>猫管理-猫咪种类</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- iCheck -->
    <!-- Morris chart -->
    <!-- jvectormap -->
    <!-- Date Picker -->
    <!-- Daterange picker -->
    <!-- Bootstrap time Picker -->
    <!--<link rel="stylesheet" href="../../../plugins/timepicker/bootstrap-timepicker.min.css">-->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--数据表格-->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- Bootstrap Color Picker -->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--bootstrap-markdown-->
    <!-- Theme style -->
    <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
    <!-- Ion Slider -->
    <!-- ion slider Nice -->
    <!-- bootstrap slider -->
    <!-- bootstrap-datetimepicker -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->








    <!-- jQuery 2.2.3 -->
    <!-- jQuery UI 1.11.4 -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.6 -->
    <!-- Morris.js charts -->
    <!-- Sparkline -->
    <!-- jvectormap -->
    <!-- jQuery Knob Chart -->
    <!-- daterangepicker -->
    <!-- datepicker -->
    <!-- Bootstrap WYSIHTML5 -->
    <!-- Slimscroll -->
    <!-- FastClick -->
    <!-- iCheck -->
    <!-- AdminLTE App -->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- bootstrap color picker -->
    <!-- bootstrap time picker -->
    <!--<script src="../../../plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
    <!-- Bootstrap WYSIHTML5 -->
    <!--bootstrap-markdown-->
    <!-- CK Editor -->
    <!-- InputMask -->
    <!-- DataTables -->
    <!-- ChartJS 1.0.1 -->
    <!-- FLOT CHARTS -->
    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
    <!-- jQuery Knob -->
    <!-- Sparkline -->
    <!-- Morris.js charts -->
    <!-- Ion Slider -->
    <!-- Bootstrap slider -->
    <!-- bootstrap-datetimepicker -->
    <!-- 页面meta /-->

    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="../plugins/morris/morris.css">
    <link rel="stylesheet" href="../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="../plugins/select2/select2.css">
    <link rel="stylesheet" href="../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-yellow sidebar-mini">

    <div class="wrapper">

        <!-- 页面头部 -->
        <jsp:include page="../head.jsp"></jsp:include>
        <!-- 页面头部 /-->

        <!-- 导航侧栏 -->
        <jsp:include page="../aside.jsp"></jsp:include>
        <!-- 导航侧栏 /-->

        <!-- 内容区域 -->
        <!-- @@master = admin-layout.html-->
        <!-- @@block = content -->

        <div class="content-wrapper">

            <!-- 内容头部 -->
            <section class="content-header">
                <h1>
                    猫管理
                    <small>全部猫种类</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                    <li><a href="#">猫管理</a></li>
                    <li class="active">全部猫种类</li>
                </ol>
            </section>
            <!-- 内容头部 /-->

            <!-- 正文区域 -->
            <section class="content">

                <!-- .box-body -->
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">全部猫种类</h3>
                    </div>

                    <div class="box-body">

                        <!-- 数据表格 -->
                        <div class="table-box">

                            <!--工具栏-->
                            <div class="pull-left">
                                <div class="form-group form-inline">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-default" title="新建" onclick="add1()"><i class="fa fa-file-o"></i> 新建</button>
                                        <button type="button" class="btn btn-default" title="删除"><i class="fa fa-trash-o"></i> 删除</button>
                                        <button type="button" class="btn btn-default" title="刷新" onclick="reload1()"><i class="fa fa-refresh"></i> 刷新</button>
                                    </div>
                                </div>
                            </div>
                            <div class="box-tools pull-right">
                                <div class="has-feedback">
                                    <input type="text" class="form-control input-sm" placeholder="搜索">
                                    <span class="glyphicon glyphicon-search form-control-feedback"></span>
                                </div>
                            </div>
                            <!--工具栏/-->

                            <!--数据列表-->
                            <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                                <thead>
                                    <tr>
                                        <th class="" style="padding-right:0px;">
                                            <input id="selall" type="checkbox" class="icheckbox_square-blue">
                                        </th>
                                        <th>种类编号</th>
                                        <th>种类名称</th>
                                        <th>种类体型</th>
                                        <th>种类毛长</th>
                                        <th>操作</th>
                                </thead>
                                <tbody>
                                    <c:forEach items="${pageInfo.list}" var="cat">
                                        <tr>
                                            <td><input name="ids" type="checkbox"></td>
                                            <td>${cat.categoryId}</td>
                                            <td>${cat.categoryName}</td>
                                            <td>${cat.categoryBody}</td>
                                            <td>${cat.categoryHair}</td>
                                            <td>
                                                <button type="button" id="detail" onclick="findOne1(${cat.categoryId})" class="btn bg-olive btn-xs">详情</button>
                                                <button type="button" id="edit" onclick="edit1(${cat.categoryId})" class="btn bg-olive btn-xs">编辑</button>
                                                <button type="button" id="delete" onclick="delete1(${cat.categoryId})" class="btn btn-danger btn-xs">删除</button>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <!--
                            <tfoot>
                            <tr>
                            <th>Rendering engine</th>
                            <th>Browser</th>
                            <th>Platform(s)</th>
                            <th>Engine version</th>
                            <th>CSS grade</th>
                            </tr>
                            </tfoot>-->
                            </table>
                            <!--数据列表/-->

                        </div>
                        <!-- 数据表格 /-->


                    </div>
                    <!-- /.box-body -->

                    <!-- .box-footer-->
                    <div class="box-footer">
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                总共<font color="red">${pageInfo.pages}</font>页，共<font color="red">${pageInfo.total}</font>条数据&nbsp;  每页
                                <select class="form-control" id="selectSizes" onchange="selectSizes()">
                                    <option ${pageInfo.pageSize eq 1 ? "selected":""}>1</option>
                                    <option ${pageInfo.pageSize eq 2 ? "selected":""}>2</option>
                                    <option ${pageInfo.pageSize eq 3 ? "selected":""}>3</option>
                                    <option ${pageInfo.pageSize eq 4 ? "selected":""}>4</option>
                                    <option ${pageInfo.pageSize eq 5 ? "selected":""}>5</option>
                                </select> 条
                            </div>
                        </div>

                        <div class="box-tools pull-right">
                            <ul class="pagination">
                                <li>
                                    <a href="${pageContext.request.contextPath}/category/toIndexPage.do?page=1&size=${pageInfo.pageSize}" aria-label="Previous">首页</a>
                                </li>
                                <li><a href="${pageContext.request.contextPath}/category/toIndexPage.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a></li>
                                <c:forEach items="${pageInfo.navigatepageNums}" var="num">
                                    <li><a href="${pageContext.request.contextPath}/category/toIndexPage.do?page=${num}&size=${pageInfo.pageSize}">${num}</a></li>
                                </c:forEach>
                                <li><a href="${pageContext.request.contextPath}/category/toIndexPage.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a></li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/category/toIndexPage.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}" aria-label="Next">尾页</a>
                                </li>
                            </ul>
                        </div>

                    </div>
                    <!-- /.box-footer-->



                </div>

            </section>
            <!-- 正文区域 /-->

        </div>
        <!-- @@close -->
        <!-- 内容区域 /-->

        <!-- 底部导航 -->
        <jsp:include page="../footer.jsp"></jsp:include>
        <!-- 底部导航 /-->

    </div>


    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
    <script>
        $.widget.bridge('uibutton', $.ui.button);
    </script>
    <script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="../plugins/raphael/raphael-min.js"></script>
    <script src="../plugins/morris/morris.min.js"></script>
    <script src="../plugins/sparkline/jquery.sparkline.min.js"></script>
    <script src="../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script src="../plugins/knob/jquery.knob.js"></script>
    <script src="../plugins/daterangepicker/moment.min.js"></script>
    <script src="../plugins/daterangepicker/daterangepicker.js"></script>
    <script src="../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
    <script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
    <script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
    <script src="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <script src="../plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <script src="../plugins/fastclick/fastclick.js"></script>
    <script src="../plugins/iCheck/icheck.min.js"></script>
    <script src="../plugins/adminLTE/js/app.min.js"></script>
    <script src="../plugins/treeTable/jquery.treetable.js"></script>
    <script src="../plugins/select2/select2.full.min.js"></script>
    <script src="../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
    <script src="../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
    <script src="../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
    <script src="../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
    <script src="../plugins/bootstrap-markdown/js/markdown.js"></script>
    <script src="../plugins/bootstrap-markdown/js/to-markdown.js"></script>
    <script src="../plugins/ckeditor/ckeditor.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.extensions.js"></script>
    <script src="../plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="../plugins/datatables/dataTables.bootstrap.min.js"></script>
    <script src="../plugins/chartjs/Chart.min.js"></script>
    <script src="../plugins/flot/jquery.flot.min.js"></script>
    <script src="../plugins/flot/jquery.flot.resize.min.js"></script>
    <script src="../plugins/flot/jquery.flot.pie.min.js"></script>
    <script src="../plugins/flot/jquery.flot.categories.min.js"></script>
    <script src="../plugins/ionslider/ion.rangeSlider.min.js"></script>
    <script src="../plugins/bootstrap-slider/bootstrap-slider.js"></script>
    <script src="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
    <script src="../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <script>
        $(document).ready(function() {
            // 选择框
            $(".select2").select2();

            // WYSIHTML5编辑器
            $(".textarea").wysihtml5({
                locale: 'zh-CN'
            });
        });

        // 设置激活菜单
        function setSidebarActive(tagUri) {
            var liObj = $("#" + tagUri);
            if (liObj.length > 0) {
                liObj.parent().parent().addClass("active");
                liObj.addClass("active");
            }
        }


        $(document).ready(function() {

            // 激活导航位置
            setSidebarActive("admin-datalist");

            // 列表按钮 
            $("#dataList td input[type='checkbox']").iCheck({
                checkboxClass: 'icheckbox_square-blue',
                increaseArea: '20%'
            });
            // 全选操作 
            $("#selall").click(function() {
                var clicks = $(this).is(':checked');
                if (!clicks) {
                    $("#dataList td input[type='checkbox']").iCheck("uncheck");
                } else {
                    $("#dataList td input[type='checkbox']").iCheck("check");
                }
                $(this).data("clicks", !clicks);
            });
        });

        // 编辑
        function edit1(id) {
            location.href = "http://localhost/catboat/category/toUpdatePage.do?id="+id+"&page=${pageInfo.pageNum}&size=${pageInfo.pageSize}";
        }

        //删除
        function delete1(id) {
            location.href = "${pageContext.request.contextPath}/category/delete.do?id="+id+"&page=${pageInfo.pageNum}&size=${pageInfo.pageSize}";
        }

        //查询
        function findOne1(id) {
            location.href = "${pageContext.request.contextPath}/category/toDetailPage.do?id="+id+"&page=${pageInfo.pageNum}&size=${pageInfo.pageSize}";
        }

        //添加
        function  add1() {
            location.href = "${pageContext.request.contextPath}/category/toAddPage.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}";
        }

        //刷新
        function reload1() {
            location.reload();
        }

        //选择每页显示的个数
        function selectSizes() {
            var sizes = $("#selectSizes").val();
            location.href = "${pageContext.request.contextPath}/category/toIndexPage.do?page=1&size="+sizes;
        }
    </script>
</body>

</html>