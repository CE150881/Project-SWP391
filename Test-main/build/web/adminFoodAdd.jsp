<%@page import="java.sql.ResultSet"%>
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
                    <h2>Trang Thêm Món ĂN</h2>
                    <form  method="post" action="<%= request.getContextPath()%>/admin" enctype="multipart/form-data">
                        <input type="number" name="foodID" style="display: none">
                        <div class="input-form">
                            <span>Tên Món Ăn</span>
                            <input type="text"
                                   name="foodName"
                                   placeholder="FoodName"
                                   pattern="{3,30}"
                                   title="Vui Lòng nhập chữ cái (từ 3 đến 30 ký tự)">
                        </div>
                        <div class="input-form">
                            <span>Giá Món Ăn</span>
                            <input type="number" name="foodPrice" placeholder="FoodPrice" min="20000" max="500000" pattern="[3-9]|[1-3][0-9]|4[0-2]" title="Vui Lòng nhập số từ 20000 đến 500000">
                        </div>
                        <div class="input-form">
                            <span>Hình Món Ăn</span>
                            <div class="controls">
                                <div class="center">
                                    <div class="form-input">
                                        <label for="file-ip-1">Upload Image</label>
                                        <input type="file" value="Upload file" name="hinhanh" id="file-ip-1" accept="image/*" onchange="showPreview(event);">
                                        <div class="preview">
                                            <img id="file-ip-1-preview">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="input-form">
                                <span>Phân Loại</span>
                                <div class="ben">
                                    <select name="categoryID" data-placeholder="Your Favorite Football Team" id="selectError2" data-rel="chosen">
                                        <option value=""></option>
                                        <optgroup label="Thể Loại">
                                            <%
                                        ResultSet rs = (ResultSet) session.getAttribute("category");
                                        while (rs.next()) {
                                    %>

                                    <option value="<%= rs.getString("categoryID")%>"><%= rs.getString("categoryName")%></option>
                                    <%
                                        }
                                    %>
                                        </optgroup>



                                    </select>
                                </div>
                            </div>
                            <div class="input-form">
                                <input type="submit" value="Thêm" name="Add">
                            </div>
                            <div class="nut-bam"><a href="<%= request.getContextPath()%>/admin/allFood"><span style="font-family: arial;">Quay lại</span></a></div>


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