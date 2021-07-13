<%-- 
    Document   : adminCategoryAdd
    Created on : Jul 6, 2021, 2:12:02 PM
    Author     : NguyenQuocHung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Add your food</title>
        <link rel="stylesheet" href="../style.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

    </head>

    <body>
        <section>
            <!--Bắt Đầu Phần Hình Ảnh-->
            <div class="img-bg">
                <img src="../img/Thiết kế không tên.png" alt="">
            </div>
            <!--Kết Thúc Phần Hình Ảnh-->
            <!--Bắt Đầu Phần Nội Dung-->
            <div class="noi-dung">
                <div class="form">
                    <h2>Trang Thêm Phân Loại Món ĂN</h2>
                    <form  method="post" action="<%= request.getContextPath()%>/admin" >
                        <input type="number" name="foodID" style="display: none">
                        <div class="input-form">
                            <span>Phân loại món ăn</span>
                            <input type="text"
                                   name="categoryName"
                                   placeholder=""
                                   pattern="{3,30}"
                                   title="Vui Lòng nhập chữ cái (từ 3 đến 30 ký tự)">
                        </div>
                        
                            <div class="input-form">
                                <input type="submit" value="Thêm" name="addCategory">
                            </div>
                            <div class="nut-bam"><a href="<%= request.getContextPath()%>/admin/allCategory"><span style="font-family: arial;">Quay lại</span></a></div>


                    </form>
                    <h3>Cơm Gà Lê Trang</h3>
                    <ul class="icon-dang-nhap">
                        <li><i class="fa fa-facebook" aria-hidden="true"></i></li>
                        <li><i class="fa fa-google" aria-hidden="true"></i></li>
                        <li><i class="fa fa-twitter" aria-hidden="true"></i></li>
                    </ul>
                </div>
            </div>
            <!--Kết Thúc Phần Nội Dung-->
        </section>
        <script src="../formjavascript.js"></script>
    </body>

</html>
