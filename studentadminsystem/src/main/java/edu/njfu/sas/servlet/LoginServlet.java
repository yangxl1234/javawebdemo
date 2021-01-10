package edu.njfu.sas.servlet;

import com.google.gson.Gson;
import edu.njfu.sas.dao.UserDao;
import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


@WebServlet(urlPatterns ="/userLogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=utf-8");
//        response.setCharacterEncoding("UTF-8");
//        PrintWriter writer=response.getWriter();
//        Map map=new HashMap<>();
//        //1.获取用户输入
//        String userName=request.getParameter("username");
//        String password=request.getParameter("password");
//        if(userName!=null&&password!=null)
//        {
//            //2.创建对象
//            User u=new User(userName,password);
//            //3.验证密码
//            UserDao userDao=new UserDaoImpl();
//            boolean result=userDao.checkLogin(u);
//            if(result){
//                map.put("result","ok");
//                map.put("msg","登录成功");
//            }else{
//                map.put("result","false");
//                map.put("msg","登录失败");
//            }
//        }else{
//            map.put("result","false");
//            map.put("msg","登录失败");
//        }
//        writer.write(new Gson().toJson(map));
//    }
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(userName, password);
        UserDaoImpl userDao = new UserDaoImpl();
        boolean result = false;
        result = userDao.checkLogin(user);
        if (result) {
            PrintWriter out1 = response.getWriter();
            out1.write("100");
        } else {
            PrintWriter out2 = response.getWriter();
            out2.write("200");

        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
