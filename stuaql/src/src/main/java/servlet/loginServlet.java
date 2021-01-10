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

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(userName, password);
        UserDaoImpl userDao=new UserDaoImpl();
        boolean result= false;
        try {
            result = userDao.checkLogin(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(result){
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
