package edu.njfu.sas.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@WebFilter(urlPatterns = "/*")
public class CharacterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        CharacterRequest characterRequest = new CharacterRequest(request);
        //4.放行
        filterChain.doFilter(characterRequest,response);

    }

    @Override
    public void destroy() {

    }
}

class CharacterRequest extends HttpServletRequestWrapper{
    private HttpServletRequest request;//包装对象
    public CharacterRequest(HttpServletRequest request) {
        super(request);
        this.request=request;
    }
    @Override
    public String getParameter(String name){
        String value=super.getParameter(name);
        if(value==null){
            return null;
        }
        String method=super.getMethod();
        if(method.equalsIgnoreCase("get")){
            try {
                value=new String(value.getBytes("iso-8859-1"),"utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return value;
    }
}
