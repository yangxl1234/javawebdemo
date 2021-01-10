<%@ page import="java.sql.*" %>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="njfu.edu.dao.UserDao" %>
<%@ page import="njfu.edu.model.User" %>
<%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/9/22
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //获取用户名密码
    String userName=request.getParameter("username");
    String password=request.getParameter("password");
    //创建UserDao对象
    UserDao userDao=new UserDao();

   if (userDao.checkLogin(new User(userName,password))){
            //out.print("用户名与密码正确");
       session.setAttribute("user","userName");
       response.sendRedirect("njfu.jsp");
        }else{
            out.print("<script>alter('用户名与密码错误！');location.href='login.html'</script>");
        }


%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>