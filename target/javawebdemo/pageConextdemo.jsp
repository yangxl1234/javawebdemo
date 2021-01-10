<%--
  Created by IntelliJ IDEA.
  User: qwe
  Date: 2020/10/20
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContextdemo</title>
</head>
<body>
<%
    /**
     * 可通过pageContext，获取其他八种对象
     */
    //1.get out
    JspWriter out1=pageContext.getOut();
    out1.print("hello,world");
    //2.get request
    ServletRequest request1=pageContext.getRequest();
    //3.get response
    ServletResponse response1= pageContext.getResponse();
    response1.getWriter().write("hello");
    //4. get exception
    Exception exception= pageContext.getException();
    //5. get page
    Object page1=pageContext.getPage();
    //6.get conf
    ServletConfig servletConfig= pageContext.getServletConfig();;
    //7.get session
    ServletContext servletContext= pageContext.getServletContext();
    //page<request<session<application
    pageContext.setAttribute("user","PageUser");
    request.setAttribute("user","requestUser");
    session.setAttribute("user","sessionUser");
    application.setAttribute("user","applicationUser");
    out.print(pageContext.findAttribute("user"));
%>
</body>
</html>
