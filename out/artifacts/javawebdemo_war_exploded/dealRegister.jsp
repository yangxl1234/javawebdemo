<%@ page import="njfu.edu.dao.UserDao" %>
<%@ page import="njfu.edu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/9/29
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //获取用户名与密码
    String userName=request.getParameter("username");
    String password=request.getParameter("password");
    User user=new User(userName,password);
    //保存
    UserDao userDao=new UserDao();
    boolean result=userDao.saveUser(user);
    //根据保存的结果返回信息给用户
    if(result){
        //跳转到success页面
        response.sendRedirect("success.jsp");
    }else{
        out.print("<script>alert('用户名密码错误'");
    }
%>