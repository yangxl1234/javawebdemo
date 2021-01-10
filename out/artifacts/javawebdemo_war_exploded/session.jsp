<%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/10/19
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>
<%
    /**
     * 用户与服务器的一次交互
     * setAttribute()
     * getAttribute()
     */
    session.setAttribute("HELLO2","HELLO,session!");
    response.sendRedirect("shows2.jsp");
    /**
     *使用session可以做到防盗链功能
     * 只有认证用户可以访问，非认证用户不可以访问
     *
     */
%>
</body>
</html>
