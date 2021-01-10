<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/10/19
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>request demo</title>
</head>
<body>
<form action="requestdemo.jsp" method="get">
    请输入姓名：<input type="text" name="text"/>
    <input type="submit" value="确定" name="submit"/>
</form>
<%
    String submit=request.getParameter("submit");
    /**
     * 首次打开本页面submit为null
     * 判断submit是否为null，不为null表示提交，null表示没有提交
     */
    if(submit!=null&&submit.equals("确定")){
        out.print(request.getParameter("name"));
        //StudentDao studentDao =new StudentDaoImpl();
        //List<Student>
        request.setAttribute("hello","hello,world");
        //页面跳转
        request.getRequestDispatcher("shows.jsp").forward(request,response);

    }
%>
</body>
</html>
