<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/10/19
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response demo</title>
</head>
<body>
<%
    PrintWriter writer=response.getWriter();
    writer.write("hello");
    writer.write("中国");
    //页面跳转
    //response.sendRedirect("shows.jsp");
    response.setHeader("refresh","1");
%>
<%= new Date() %>
</body>
</html>
