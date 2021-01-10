package edu.njfu.sas.servlet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.njfu.sas.dao.StudentDao;
import edu.njfu.sas.dao.impl.StudentDaoImpl;
import edu.njfu.sas.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String name=new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
        StudentDao sdao=new StudentDaoImpl();
        List<Student> students=null;
        students=sdao.getStudentsByName(name);
        String student=new Gson().toJson(students);
        PrintWriter out=response.getWriter();
        out.write(student);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
