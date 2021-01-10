package edu.njfu.sas.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String encoding=filterConfig.getInitParameter("encoding");
        String namespace=filterConfig.getInitParameter("namespace");
        System.out.println("MyFilter.init()is called");
        System.out.println("--------"+encoding+"----"+namespace);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //System.out.println("MyFilter.doFilter()is called");
        //检查用户是否登录，如果没有登陆，跳转到登录界面
        //1.如何判断用户是否已经登录，不存在用户没有登录
        HttpSession session=((HttpServletRequest) servletRequest).getSession();
        Object user=session.getAttribute("user");
        if(user==null){
            PrintWriter writer=((HttpServletResponse) servletResponse).getWriter();
            writer.write("<script>alert('The user is not logged in. Please log in and visit');location.href='index.html'</script>");
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter.destroy() is called");
    }
}
