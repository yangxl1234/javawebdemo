package edu.njfu.sas.servlet;

import edu.njfu.sas.dao.StudentDao;
import edu.njfu.sas.dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/qweServlet")
public class DeleteStudentServletServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String stuname=request.getParameter("stuname");
        StudentDao sdao=new StudentDaoImpl();
        sdao.deleteStu(stuname);
        try {
            //List<Student>students=sdao.getAllStudent();
            PrintWriter out=response.getWriter();
            out.write(sdao.getAllStudent());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//        PrintWriter out=response.getWriter();

//        try {
//            System.out.print(sdao.getAllStudent());
//            out.write(sdao.getAllStudent());
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
