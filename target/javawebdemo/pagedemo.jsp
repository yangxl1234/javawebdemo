<%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/10/20
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page demo</title>
</head>
<body>
<%=page.hashCode()
%><br>
<%=page.getClass().toString()%>
<%
    /**
     * 什么是hashcode
     * 内存地址经过hash函数后得到的数值叫做hashcode是内存地址经过hash函数变换后的结果
     * hashcode的作用是什么
     * 为了快速查找对象
     */
    /**
     * 1.创建学生类包含stuNo,stuName,department三个属性
     * 2.重写student类equals，hashcode方法，规定只要stuNo与stuName都相同则认为这两个对象相等
     */
%>
</body>
</html>
