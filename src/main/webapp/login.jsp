<%--
  Created by IntelliJ IDEA.
  User: dereknoble
  Date: 2019-06-11
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int counter = 0; %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post">
    <input type="text" name="username" id="username">
    <br>
    <input type="password" name="password" id="password">
    <br>
    <input type="submit">
</form>
<c:if test="${param.username =='admin' && param.password == 'password'}">
    <%response.sendRedirect("/profile.jsp");%>
</c:if>
</body>

</html>
