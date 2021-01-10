<%@ page import="dao.StudentDao" %>
<%@ page import="dao.Impl.StudentDaoImpl" %>
<%@ page import="model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2021/1/1
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    StudentDao sdao=new StudentDaoImpl();
    try {
        PrintWriter out1=response.getWriter();
        System.out.print(sdao.getAllStudent());
        out1.write(sdao.getAllStudent());
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
%>
</body>
</html>
