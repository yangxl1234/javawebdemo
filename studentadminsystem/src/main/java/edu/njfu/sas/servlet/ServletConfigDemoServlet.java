package edu.njfu.sas.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ServletConfigDemoServlet")
//@WebServlet(urlPatterns = "/ServletConfigDemoServlet"
//    initParams = {@WebInitParam(name="pageSize",value="10"),
//        @WebInitParam(name="encoding",value = "utf-8")
//    }
//    )
public class ServletConfigDemoServlet extends HttpServlet {
    private Integer pageSize;
    private String encoding;
    private ServletContext application;
    @Override
    public void init(ServletConfig config) throws ServletException {
        application=config.getServletContext();
        pageSize =Integer.parseInt(application.getInitParameter("pageSize"));
        encoding =application.getInitParameter("encoding");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.getWriter().write(pageSize+""+encoding);
    application.setAttribute("classname","software engineer 18!");
    response.sendRedirect("/anotherServlet");
    }
}
