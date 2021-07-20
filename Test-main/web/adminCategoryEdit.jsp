<%-- 
    Document   : adminCategoryEdit
    Created on : Jul 6, 2021, 2:05:08 PM
    Author     : NguyenQuocHung
--%>

<%@page import="Entity.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>CHỈNH SỬA PHÂN LOẠI</title>
        <link rel="stylesheet" href="../../style.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

    </head>

    <body>
        <section>
            <!--Bắt Đầu Phần Hình Ảnh-->
            <div class="img-bg">
                <img src="../../img/Thiết kế không tên.png" alt="">
            </div>
            <!--Kết Thúc Phần Hình Ảnh-->
            <!--Bắt Đầu Phần Nội Dung-->
            <div class="noi-dung">
                <div class="form">
                    <h2>Trang Chỉnh Sửa Phân Loại Món ĂN</h2>
                    <%
                    Category c = (Category)session.getAttribute("category");                   
                    %>
                    <form  method="post" action="<%= request.getContextPath()%>/admin" >
                        <input type="number" name="foodID" style="display: none">
                        <div class="input-form">
                            <input type="text" name="categoryID" value="<%= c.getCategoryID() %>" style="display: none">
                            <span>Phân loại món ăn</span>
                            <input type="text"
                                   required="required"
                                   name="categoryName"
                                   value="<%= c.getCategoryName() %>"
                                   placeholder=""
                                   pattern="[A-Za-zaàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz\s]{3,30}"
                                   title="Vui Lòng nhập chữ cái (từ 3 đến 30 ký tự), không số, ký tự đặc biệt">
                        </div>
                        
                            <div class="input-form">
                                <input type="submit" value="Chỉnh Sửa" name="editCategory">
                            </div>
                            <div class="nut-bam"><a href="<%= request.getContextPath()%>/admin/allCategory"><span style="font-family: arial;">Quay lại</span></a></div>


                    </form>
                    
                </div>
            </div>
            <!--Kết Thúc Phần Nội Dung-->
        </section>
        <script src="../../formjavascript.js"></script>
    </body>

</html>
