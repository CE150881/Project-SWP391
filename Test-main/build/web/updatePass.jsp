<%-- 
    Document   : updatePass
    Created on : Jul 10, 2021, 11:22:40 AM
    Author     : ngonh
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Page</title>
    </head>
    <body 
        <c:if test="${not empty requestScope.FALIEDRENEWPASS}">
            onload="loadFALIEDRENEWPASS()"
        </c:if>
        <c:if test="${not empty requestScope.FAILEDCURRENTPASS}">
            onload="loadFAILEDCURRENTPASS()"
        </c:if>
        >
        <a href="login.jsp">LOGIN</a><br><br>
        <a href="signup.jsp">SIGNUP</a><br><br>

        <h1>UPDATE PASS</h1>
        <form action="updatePass" method="POST">            
            <label>Pass Current</label>
            <input type="password" name="txtPasswordCurrent" value=""/><br><br>
            <label>New Password</label>
            <input type="password" name="txtNewPassword" value="" /><br><br> 
            <label>ReNew Password</label>
            <input type="password" name="txtReNewPassword" value="" /> <br><br>
            <button type="submit">SAVE</button>            
        </form>
    </body>
    <script>
        function loadFALIEDRENEWPASS() {
            alert("${requestScope.FALIEDRENEWPASS}");
        }
        function loadFAILEDCURRENTPASS() {
            alert("${requestScope.FAILEDCURRENTPASS}");
        }
    </script>
</html>
