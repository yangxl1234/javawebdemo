<%@ page import="model.Student" %>
<%@ page import="dao.Impl.StudentDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: 10909
  Date: 2020/10/26
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    /**
     * 获取学生信息
     */
    request.setCharacterEncoding("utf-8");
    String stuno = request.getParameter("stuno");
    String stuname = request.getParameter("stuname");
    String classes = request.getParameter("classes");
    String gender = request.getParameter("gender");
    String department = request.getParameter("department");
    String tel = request.getParameter("tel");
    String dormno = request.getParameter("dormno");
    //out.println(stuno+stuname+classes+gender+department+tel+dormno);
    /**
     * 根据学生信息生成Student对象
     */
    Student s=new Student(stuno,stuname,classes,gender,department,tel,dormno,"10");
    /**
     * 调用StudentDao对象保存学生对想到数据库
     */
    System.out.println(s.getClasses());
    //StudentDao studentdao=new StudentDaoImpl();
    //boolean tf=studentdao.saveStudent(s);
    //out.print(tf);
    boolean tf=new StudentDaoImpl().saveStudent(s);
    /**
     * 根据保存结果，进行页面跳转
     * true 跳转到liststudents
     * false 跳转到错误页面
     */
    if(tf==true){
        response.sendRedirect("liststudents.jsp");
    }else{
        response.sendRedirect("index.jsp");
    }
%>