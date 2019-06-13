<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dereknoble
  Date: 2019-06-12
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>"List of ads"</h1>

<ul>
    <c:forEach items="${ads}" var="ad">
        <li>${ad.title}</li>
        <li>${ad.description}</li>
        <li>${ad.userId}</li>
        <br>
    </c:forEach>

</ul>


</body>
</html>
