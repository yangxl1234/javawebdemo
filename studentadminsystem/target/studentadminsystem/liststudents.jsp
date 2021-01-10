<%@ page import="edu.njfu.sas.dao.StudentDao" %>
<%@ page import="edu.njfu.sas.dao.impl.StudentDaoImpl" %>
<%@ page import="edu.njfu.sas.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="com.google.gson.Gson" %>
<%@ page import="java.lang.reflect.Type" %>
<%@ page import="com.google.gson.reflect.TypeToken" %><%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/10/12
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表展示</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
<h1 align="center">软件工程18级学生信息表</h1>
<hr>
<form action="liststudents.jsp" method="post">
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
        request.setCharacterEncoding("utf-8");
        String submit=request.getParameter("submit");
        StudentDao sdao=new StudentDaoImpl();

        List<Student> students=null;
        if(submit!=null && submit.equals("确定")){
            //查询处理
            //获取字符串
            String name=request.getParameter("userName");
            //调用查询结果
            students=sdao.getStudentsByName(name);
        } else{
            String s=sdao.getAllStudent();
            Gson gson=new Gson();
            Type type=new TypeToken<List<Student>>(){
            }.getType();
            students=(List<Student>)gson.fromJson(s,type);
        }

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
            <img src="<%=s.getPhotoPath()%>" style="width:50px;height:50px"/>
        </td>
        <td>
            <a href="updatestudent.jsp?stuno=<%=s.getStuNo()%>">修改</a>
        </td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>

