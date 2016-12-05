package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created by dubo on 16/12/5.
 */
//@WebFilter(urlPatterns = {"/*",""},filterName = "",initParams = {@WebInitParam(name="",value = "")})
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //Tomcat启动时被调用
        System.out.println("TestFilter init()");
    }

    @Override
    public void destroy() {

        System.out.println("TestFilter destroy()");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("TestFilter doFilter()");
        filterChain.doFilter(servletRequest,servletResponse);
    }


}
