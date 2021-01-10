<%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/9/22
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>

<%--@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName=request.getParameter("username");
    String password=request.getParameter("password");
    if(userName!=null&&password.equals("password")){
        out.print("用户名与密码正确");
    }else {
        out.print("密码错误");
    }
--%>


