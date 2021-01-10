package servlet;

import dao.Impl.UserDaoImpl;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        User u=new User(username,password);
        boolean tf= false;
        try {
            tf = new UserDaoImpl().saveUser(u);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(tf){
            PrintWriter out1=response.getWriter();
            out1.write("100");
        }else {
            PrintWriter out2=response.getWriter();
            out2.write("200");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
