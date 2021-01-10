<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/12/14
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    你的用户名为:${requestScope.username},密码为${requestScope.password}<br>
<%
    String username=(String)request.getAttribute("username");
    String password=(String)request.getAttribute("password");
%>
你的用户名为<%=username%>,密码为<%=password%>
<%
    //response.setCharacterEncoding("UTF-8");

%>
${pageContext.response.characterEncoding}
</body>
</html>
