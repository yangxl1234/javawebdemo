package edu.njfu.sas.filter;

import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.User;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AutoLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //1.把servlRequest转换为HttpServletRequest
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        //2获取cookie，是保存client端的key-value
        Cookie[] cookies=request.getCookies();
        String autoLogin=null;
        for(Cookie c:cookies){
            if(c.getName().equalsIgnoreCase("autologin")){
                autoLogin=c.getValue();
            }
        }
        if(autoLogin!=null){
            String[] users=autoLogin.split("-");
            User u=new User(users[0],users[1]);
            boolean result=new UserDaoImpl().checkLogin(u);
            if(result){
                request.getSession().setAttribute("user",u);
            }
        }
        //放行
        filterChain.doFilter(request,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
