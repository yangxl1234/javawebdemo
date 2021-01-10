<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<link rel="stylesheet" href="../css/style2.css"/>
<ul>
    <li><a href="liststudentsbypaging.jsp?page=1">首 页</a></li>
    <%
        if(currentPage!=1){


    %>
    <li><a href="liststudentsbypaging.jsp?page=<%=currentPage-1%>">上一页</a></li>
    <%
        }
    %>
    <%
        if(currentPage!=pageUtil.getMaxPage()){
    %>
    <li><a href="liststudentsbypaging.jsp?page=<%=currentPage+1%>">下一页</a></li>
    <%
        }
    %>
    <li><a href="liststudentsbypaging.jsp?page=<%=pageUtil.getMaxPage()%>">尾 页</a></li>
    <li style="width: 200px">
        <form action="liststudentsbypaging.jsp" method="post">
            跳转到<select name="page" id="selectPage">
            <option>请选择</option>
        </select> 页
            <input type="submit" name="submit" value="确定">
        </form>
    </li>
</ul>
<script>
    function insertPage(element,maxPage){
        for(i=1;i<=maxPage;i++){
            element.options.add(new Option(i,i));
        }
    }
    insertPage(document.getElementById("selectPage"),"<%=pageUtil.getMaxPage()%>");
</script>
<%
    int pageSize2=pageUtil.getCurrentPage();
    if(pageSize2==1){
        pageSize2=2;
    }
    if(pageSize2>=6){
        pageSize2=6;
    }
    for(int i=pageSize2-1;i<pageSize2+3;i++){
%>
<a href="liststudentsbypaging.jsp?page=<%=i%>"><%=i%>&nbsp;</a>

<%
    }
%>
