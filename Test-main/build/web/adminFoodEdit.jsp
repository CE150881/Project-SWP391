<%@page import="java.sql.ResultSet"%>
<%@page import="Entity.Food"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>CHỈNH SỬA SẢN PHẨM</title>
        <link rel="stylesheet" href="../../style.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <script language="javascript" type="text/javascript">
            window.onload = function () {
                var fileUpload = document.getElementById("fileupload");
                fileUpload.onchange = function () {
                    if (typeof (FileReader) != "undefined") {
                        var dvPreview = document.getElementById("dvPreview");
                        dvPreview.innerHTML = "";
                        var regex = /^([a-zA-Z0-9\s_\\.\-:])+(.jpg|.png)$/;
                        for (var i = 0; i < fileUpload.files.length; i++) {
                            var file = fileUpload.files[i];
                            if (regex.test(file.name.toLowerCase())) {
                                var reader = new FileReader();
                                reader.onload = function (e) {
                                    var img = document.createElement("IMG");
                                    img.height = "150";
                                    img.width = "150";
                                    img.src = e.target.result;
                                    dvPreview.appendChild(img);
                                }
                                reader.readAsDataURL(file);
                            } else {
                                alert(file.name + " is not a valid image file.");
                                dvPreview.innerHTML = "";
                                return false;
                            }
                        }
                    } else {
                        alert("This browser does not support HTML5 FileReader.");
                    }
                }
            };
        </script>
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
                    <h2>Trang Chỉnh Sửa Món ĂN</h2>
                    <%
                    Food f = (Food)session.getAttribute("food");
                    String image = f.getImage();
                                                
                    %>
                    <form method="post" action="<%= request.getContextPath()%>/admin" enctype="multipart/form-data">
                        <input type="text" name="foodID" value="<%= f.getFoodID() %>" style="display: none">
                        <div class="input-form">
                            <span>Tên Món Ăn</span>
                            <input type="text"
                                   required="required"
                                   name="foodName"
                                   placeholder="FoodName"
                                   pattern="[A-Za-zaàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz\s]{3,30}"
                                   title="Vui Lòng nhập chữ cái (từ 3 đến 30 ký tự), không số, ký tự đặc biệt"
                                   value="<%= f.getFoodName() %>">
                        </div>
                        <div class="input-form">
                            <span>Giá Món Ăn</span>
                            <input name="foodPrice" required="required" value="<%= f.getFoodPrice() %>" type="number"  placeholder="FoodPrice" min="10000" max="500000" pattern="[0-9]" title="Vui Lòng nhập số từ 10000 đến 500000">
                        </div>
                        <div class="input-form">
                            <div class="input-form">
                            <span>Hình Món Ăn</span>
                            <div class="controls">
                                <input id="fileupload" type="file" accept=".png, .jpg"  multiple="multiple" name="hinhanh"/>
                                <hr />
                                <b>Live Preview </b>
                                <br />
                                <br />
                                <div id="dvPreview">
                                    <img src="../../upload/<%= image %>" height="150px" width="150px" >
                                </div>
                                <div id="dvPreview">
                                </div>
                            </div>
                            <div class="input-form">
                                <span>Phân Loại</span>
                                <div class="ben">
                                    <select name="categoryID" data-placeholder="" id="selectError2" data-rel="chosen">
                                        

                                        <optgroup label="Phân Loại">
                                            <%
                                            ResultSet rs = (ResultSet)session.getAttribute("category");
                                            int categoryID = f.getCategoryID();
                                            int categoryID2 ;
                                            while(rs.next()){
                                            categoryID2 = rs.getInt("categoryID"); 
                                        %>
                                            <option value="<%= categoryID2 %>" 
                                                    <% if(categoryID == 
                                                            categoryID2)
                                            { %> selected <% } %>
                                                    > <%= rs.getString("categoryName") %> </option>
                                            <%
                                                }
                                            %>
                                        </optgroup>



                                    </select>
                                </div>
                            </div>
                            <div class="input-form">
                                <input type="submit" name="edit" value="Chỉnh sửa">
                            </div>
                            <div class="nut-bam"><a href="<%= request.getContextPath()%>/admin/allFood"><span style="font-family: arial;">Quay lại</span></a></div>


                    </form>
                    
                </div>
            </div>
            <!--Kết Thúc Phần Nội Dung-->
        </section>
        <script src="../../formjavascript.js"></script>
    </body>

</html>