package edu.njfu.sas.servlet;

import edu.njfu.sas.dao.impl.StudentDaoImpl;
import edu.njfu.sas.dao.StudentDao;
import edu.njfu.sas.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/returnStudentsServlet")
public class returnStudentsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        StudentDao sdao=new StudentDaoImpl();
        try {
            //List<Student>students=sdao.getAllStudent();
            PrintWriter out=response.getWriter();
            out.write(sdao.getAllStudent());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
