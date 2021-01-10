<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>Hello World!111</h2>
<%
    out.print("hello world!111");
%>
<%
    String name ="张三11111";
    System.out.println(name);
    out.print(name);

%>

<%!
    public void print(){
        System.out.print("hello world");
    }
%>
<%=
    new Date()
%>
</body>
</html>
