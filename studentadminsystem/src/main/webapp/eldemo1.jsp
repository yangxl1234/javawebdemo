<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/12/14
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el demo</title>
</head>
<body>
<%
    request.setAttribute("username","张三");
    request.setAttribute("password","123456");
    request.getRequestDispatcher("/eldemo2.jsp").forward(request,response);
%>
</body>
</html>
