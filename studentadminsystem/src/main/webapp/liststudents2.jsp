<%@ page import="edu.njfu.sas.dao.StudentDao" %>
<%@ page import="edu.njfu.sas.model.Student" %>
<%@ page import="edu.njfu.sas.dao.impl.StudentDaoImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/12
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表展示</title>
    <link rel="stylesheet" href="../../../../../../Desktop/studentadminsystem/src/main/webapp/css/style.css">
</head>
<body>
<h1 align="center">软件工程18级学生信息表</h1>
<hr>
<form action="../../../../../../Desktop/studentadminsystem/src/main/webapp/liststudents.jsp" method="post">
    请输入姓名: <input type="text" id="userName" name="userName">
    <input type="submit" value="yes" id="submit" name="submit">
</form>
<hr>

<table>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>性别</td>
        <td>系部</td>
        <td>电话</td>
        <td>宿舍号</td>
        <td>照片</td>
        <td>操作</td>
    </tr>
    <%
        List<Student> students = (List<Student>) request.getAttribute("students");
        if(students!=null)
        for(Student s:students){
    %>

    <tr>
        <td><%=s.getStuNo()%></td>
        <td><%=s.getStuName()%></td>
        <td><%=s.getClasses()%></td>
        <td><%=s.getGender()%></td>
        <td><%=s.getDepartment()%></td>
        <td><%=s.getTel()%></td>
        <td><%=s.getDormNo()%></td>
        <td>
            <img src="<%=s.getPhotoPath()%>" style="width:50px;height:50px"/></td>
        <td><a href="../../../../../../Desktop/studentadminsystem/src/main/webapp/updatestudent.jsp?stuno=<%=s.getStuNo()%>">修改</a></td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>
