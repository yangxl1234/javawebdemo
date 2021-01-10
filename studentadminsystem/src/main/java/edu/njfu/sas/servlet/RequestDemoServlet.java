package edu.njfu.sas.servlet;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/requestTest")
public class RequestDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html/charest=utf-8");
        PrintWriter writer= resp.getWriter();
        writer.write("getRenoteAddr():"+req.getRemoteAddr()+"<br>");
        writer.write("getRemoteHost():"+req.getRemoteHost()+"<br>");
        writer.write("getServerPort():"+req.getServerPort()+"<br>");
        writer.write("getProtocol():"+req.getProtocol()+"<br>");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        writer.write(username+"--"+password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        Map map=new HashMap();
        map.put("username",username);
        map.put("password",password);
        resp.getWriter().write(new Gson().toJson(map));
    }
}
