package edu.njfu.sas.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class ServletDemo2 extends GenericServlet {
    /**
     *GenericServlet
     */

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("GenericServlet is in servicing!");
        PrintWriter out = servletResponse.getWriter();
        out.write("hello world!");
    }
}
