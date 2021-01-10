<%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/10/20
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp action</title>
</head>
<body>
<%
    //jsp:include
    //jsp:forward
%>
<jsp:include page="logo.jsp"/>
<jsp:include page="adv.jsp"/>
<jsp:include page="main.jsp"/>
<jsp:include page="footer.jsp"/>
<%
    /**
     * jsp:include与page include
     * 1.功能相同
     * 2.区别
     * include指令是一个静态包含，包含文件合并后组成一个新文件进行编译执行
     * include动作是一个动态包含，程序执行到包含文件才动态的引入，包含文件是两个实体
     */
%>
<%
    /**
     * jsp forward 可以直接跳转到其他页面
     */
%>
<jsp:forward page="http://www.baidu.com"></jsp:forward>
<%
    /**
     * 作业
     */
%>
</body>
</html>
