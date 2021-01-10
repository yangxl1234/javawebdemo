//package edu.njfu.sas.servlet;
//
//import edu.njfu.sas.dao.impl.StudentDaoImpl;
//import edu.njfu.sas.model.Student;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet("/ListStudentServlet")
//public class ListStudentServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        StudentDaoImpl studentDao=new StudentDaoImpl();
//        List<Student> allstudent=studentDao.getAllStudent();
//        request.setAttribute("students",allstudent);
//        request.getRequestDispatcher("liststudents2.jsp").forward(request,response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request,response);
//    }
//}
