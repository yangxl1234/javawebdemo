<%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/26
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<h1>添加学生</h1>
<form action="dealaddstudent.jsp" method="get" id="form1">
    请输入学号:<input type="text" id="stuno" name="stuno"><br>
    请输入姓名:<input type="text" id="stuname" name="stuname"><br>
    请选择班级:<select name="classes" id="classes">
        <option value="软件工程1808041">软件工程1808041</option>
        <option value="软件工程1808042">软件工程1808042</option>
        <option value="计算机应用技术1808041">计算机应用技术1808041</option>
        <option value="计算机应用技术1808042">计算机应用技术1808042</option>
         </select>
    <br>
    请选择性别:<select name="gender" id="gender">
            <option value="男">男</option>
            <option value="女">女</option>
        </select>
    <br>
    请选择系部:<select id="department" name="department">
             <option value="软件工程">软件工程</option>
             <option value="计算机应用">计算机应用</option>
        </select>
    <br>
    请输入电话:<input type="tel" id="tel" name="tel"><br>
    请选择宿舍:<select id="dormno" name="dormno">
            <option value="3-101">3-101</option>
            <option value="4-304">4-304</option>
        </select>
        <br>
    <input type="submit" value="提交" name="submit">
</form>


</body>
</html>
