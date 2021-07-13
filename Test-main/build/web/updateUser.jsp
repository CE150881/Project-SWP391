<%-- 
    Document   : updateUser
    Created on : Jul 10, 2021, 10:56:08 AM
    Author     : ngonh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body 
        <c:if test="${not empty requestScope.UPDATEFAILED}">
            onload="loadMessage()"
        </c:if>>
        <a href="login.jsp">LOGIN</a><br><br>
        <a href="signup.jsp">SIGNUP</a><br><br>
        <h1>UPDATE INFO USER</h1>
        <form action="updateUser" method="POST">            
            <label>Phone</label>
            <input type="text" name="txtPhone" value="${sessionScope.acc.userPhone}"/><br><br>
            <label>Email</label>
            <input type="text" name="txtEmail" value="${sessionScope.acc.userEmail}"/><br><br>
            <label>Gender</label>
            <select name="txtGender" required="required">
                <option value="Other">Không cung cấp</option>
                <option value="Male">Nam</option>
                <option value="Female">Nữ</option>
            </select>

            <button type="submit">SAVE</button>            
        </form>
    </body>
    <script>
        function loadMessage() {
            alert("${requestScope.UPDATEFAILED}");
        }
    </script>
</html>
