<%-- 
    Document   : infoUser
    Created on : Jul 10, 2021, 11:05:51 AM
    Author     : ngonh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="login.jsp">LOGIN</a><br><br>
        <a href="signup.jsp">SIGNUP</a><br><br>
        <a href="updateUser.jsp">EDIT info</a><br><br>
        <a href="updatePass.jsp">EDIT pass</a>
        <h1>Information User</h1>
        
        <form>
            <label>User Name: </label>
            ${sessionScope.acc.userName} <br>
            <label>Phone: </label>
            ${sessionScope.acc.userPhone}<br>
            <label>Email: </label>
            ${sessionScope.acc.userEmail} <br>
            <label>Gender: </label>
            ${sessionScope.acc.userGender}<br>
        </form>
    </body>
</html>
