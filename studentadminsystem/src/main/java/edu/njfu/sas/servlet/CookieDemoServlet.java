package edu.njfu.sas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cookietest")
public class CookieDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("username","zhangsan");
        Cookie cookie1=new Cookie("password","123456");
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        resp.getWriter().write("cookie 已经发生！");
    }
}
