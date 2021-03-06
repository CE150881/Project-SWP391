<%-- 
    Document   : adminAllFood
    Created on : Jun 15, 2021, 2:01:10 PM
    Author     : NguyenQuocHung
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- start: Meta -->
        <meta charset="utf-8">
        <title>QUẢN LÍ DANH MỤC</title>
        <meta name="description" content="Bootstrap Metro Dashboard">
        <meta name="author" content="Dennis Ji">
        <meta name="keyword" content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <!-- end: Meta -->

        <!-- start: Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- end: Mobile Specific -->

        <!-- start: CSS -->
        <link id="bootstrap-style" href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/bootstrap-responsive.min.css" rel="stylesheet">
        <link id="base-style" href="../css/style.css" rel="stylesheet">
        <link id="base-style-responsive" href="../css/style-responsive.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
        <!-- end: CSS -->


        <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
                <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
                <link id="ie-style" href="css/ie.css" rel="stylesheet">
        <![endif]-->

        <!--[if IE 9]>
                <link id="ie9style" href="css/ie9.css" rel="stylesheet">
        <![endif]-->

        <!-- start: Favicon -->
        <link rel="shortcut icon" href="img/favicon.ico">
        <!-- end: Favicon -->




    </head>

    <body>
        <!-- start: Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">


                    <a class="brand" href="<%= request.getContextPath()%>/admin" style="font-size: 30px;font-weight: 900; color: #FDE5DD; text-transform: uppercase;">Trang Admin</a>
                    <!-- start: Header Menu -->
                    <div class="nav-no-collapse header-nav">
                        <ul class="nav pull-right">
                            <!-- start: User Dropdown -->
                            <li class="dropdown">
                                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="halflings-icon white user"></i> ${sessionScope.acc.userName}
                                    <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    
                                    
                                    <li><a href="<%= request.getContextPath()%>/logout"><i class="halflings-icon off"></i>Đăng xuất</a></li>
                                </ul>
                            </li>
                            <!-- end: User Dropdown -->
                        </ul>
                    </div>
                    <!-- end: Header Menu -->

                </div>
            </div>
        </div>
        <!-- start: Header -->

        <div class="container-fluid-full">
            <div class="row-fluid">
                

                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <center>
                        <img src="../img/hinhnen1_1.png" class="profile_image" alt="">
                        <h4 class="ten" style="font-size: 20px; color: #fbb450;">Cơm Gà Lê Trang </h4>
                            </center>
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            

                            <li><a href="<%= request.getContextPath()%>/admin"><i class="icon-bar-chart"></i><span class="hidden-tablet">Bảng tin</span></a></li>	
                            <li><a href="<%= request.getContextPath()%>/admin/allFood"><i class="icon-envelope"></i><span class="hidden-tablet">Sản phẩm</span></a></li>
                            <li><a href="<%= request.getContextPath()%>/admin/allBill"><i class="icon-tasks"></i><span class="hidden-tablet">Hóa đơn</span></a></li>
                            <li><a href="<%= request.getContextPath()%>/admin/allUser"><i class="icon-eye-open"></i><span class="hidden-tablet">Khách hàng</span></a></li>
                            <li><a href="<%= request.getContextPath()%>/admin/allCategory"><i class="icon-camera"></i><span class="hidden-tablet">Phân Loại</span></a></li>
                            

                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->

                <noscript>
                <div class="alert alert-block span10">
                    <h4 class="alert-heading">Warning!</h4>
                    <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
                </div>
                </noscript>

                <!-- start: Content -->
                <div id="content" class="span10">


                    
                    
                     <div>
                        
                        <button class="btn btn-primary" onclick="window.print()">Xuất File</button>
                    
                        <a href="addCategory" class="btn btn-primary">Thêm Phân Loại</a>
                    </div>
                    <br>
                    <div class="row-fluid sortable">		
                        <div class="box span12">
                            <div class="box-header" data-original-title>
                                <h2><i class="halflings-icon white user"></i><span class="break"></span>Phân Loại</h2>
                                <div class="box-icon">

                                    <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>

                                </div>
                            </div>
                            <div class="box-content">
                                <table class="table table-striped table-bordered bootstrap-datatable datatable">
                                    <thead>
                                        <tr>
                                            <th>Tên Phân Loại</th>
                                            <th>Chỉnh Sửa</th>
                                        </tr>
                                    </thead>   
                                    <tbody>
                                        <%
                                            ResultSet rs = (ResultSet) session.getAttribute("allCategory");
                                            while (rs.next()) {

                                        %>
                                        <tr>
                                            <td><%= rs.getString("categoryName")%></td>
                                            <td class="center">
                                                <a class="btn btn-info" href="categoryEdit/<%= rs.getString("categoryID")%>">
                                                    <i class="halflings-icon white edit"></i>  
                                                </a>

                                                <a class="btn btn-danger" href="categoryDelete/<%= rs.getString("categoryID")%>" onclick="return confirm('Bạn chắc chắn chưa, các món ăn thuộc phân loại này sẽ bị xóa?');
                                                   ">
                                                    <i class="halflings-icon white trash"></i> 
                                                </a>
                                            </td>
                                        </tr>
                                        <%
                                            }
                                        %>

                                    </tbody>
                                </table>            
                            </div>
                        </div><!--/span-->
                    </div><!--/.fluid-container-->

                    <!-- end: Content -->
                </div><!--/#content.span10-->
            </div><!--/fluid-row-->

            <div class="modal hide fade" id="myModal">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h3>Settings</h3>
                </div>
                <div class="modal-body">
                    <p>Here settings can be configured...</p>
                </div>
                <div class="modal-footer">
                    <a href="#" class="btn" data-dismiss="modal">Close</a>
                    <a href="#" class="btn btn-primary">Save changes</a>
                </div>
            </div>
            <div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
                <div class="modal-content">
                    <ul class="list-inline item-details">
                        <li><a href="http://themifycloud.com">Admin templates</a></li>
                        <li><a href="http://themescloud.org">Bootstrap themes</a></li>
                    </ul>
                </div>
            </div>
            <div class="clearfix"></div>

                </div><!--/.fluid-container-->
                

                <!-- end: Content -->
            </div><!--/#content.span10-->
        </div><!--/fluid-row-->

        <div class="modal hide fade" id="myModal">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h3>Settings</h3>
            </div>
            <div class="modal-body">
                <p>Here settings can be configured...</p>
            </div>
            <div class="modal-footer">
                <a href="#" class="btn" data-dismiss="modal">Close</a>
                <a href="#" class="btn btn-primary">Save changes</a>
            </div>
        </div>

        <div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-content">
                <ul class="list-inline item-details">
                    <li><a href="http://themifycloud.com">Admin templates</a></li>
                    <li><a href="http://themescloud.org">Bootstrap themes</a></li>
                </ul>
            </div>
        </div>

        <div class="clearfix"></div>
        
        

        <footer>

            <p>
                <span style="text-align:left;float:left">&copy; Admin <a href="" alt="Bootstrap_Metro_Dashboard">Cơm Gà Lê Trang</a></span>

            </p>

        </footer>

        <!-- start: JavaScript-->

        <script src="../js/jquery-1.9.1.min.js"></script>
        <script src="../js/jquery-migrate-1.0.0.min.js"></script>

        <script src="../js/jquery-ui-1.10.0.custom.min.js"></script>

        <script src="../js/jquery.ui.touch-punch.js"></script>

        <script src="../js/modernizr.js"></script>

        <script src="../js/bootstrap.min.js"></script>

        <script src="../js/jquery.cookie.js"></script>

        <script src='../js/fullcalendar.min.js'></script>

        <script src='../js/jquery.dataTables.min.js'></script>

        <script src="../js/excanvas.js"></script>
        <script src="../js/jquery.flot.js"></script>
        <script src="../js/jquery.flot.pie.js"></script>
        <script src="../js/jquery.flot.stack.js"></script>
        <script src="../js/jquery.flot.resize.min.js"></script>

        <script src="../js/jquery.chosen.min.js"></script>

        <script src="../js/jquery.uniform.min.js"></script>

        <script src="../js/jquery.cleditor.min.js"></script>

        <script src="../js/jquery.noty.js"></script>

        <script src="../js/jquery.elfinder.min.js"></script>

        <script src="../js/jquery.raty.min.js"></script>

        <script src="../js/jquery.iphone.toggle.js"></script>

        <script src="../js/jquery.uploadify-3.1.min.js"></script>

        <script src="../js/jquery.gritter.min.js"></script>

        <script src="../js/jquery.imagesloaded.js"></script>

        <script src="../js/jquery.masonry.min.js"></script>

        <script src="../js/jquery.knob.modified.js"></script>

        <script src="../js/jquery.sparkline.min.js"></script>

        <script src="../js/counter.js"></script>

        <script src="../js/retina.js"></script>

        <script src="../js/custom.js"></script>
        <!-- end: JavaScript-->

    </body>
</html>
