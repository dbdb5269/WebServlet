package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by dubo on 16/12/5.
 * 记录访问servlet 时间
 * 并记录访问日志
 */

@WebFilter(urlPatterns = {"/First"},filterName = "url")
public class LogFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //记录访问URl
        HttpServletRequest request=(HttpServletRequest) req;
        String path = request.getContextPath();
//        System.out.println("log: ContextPath  "+path);
        System.out.println("log: ServletPath"+request.getServletPath()+"正在访问");
        long start = System.currentTimeMillis();
        chain.doFilter(req, resp);
        long end=System.currentTimeMillis();
        System.out.println("log: ServletPath"+request.getServletPath()+"访问结束");
        System.out.println("long: time "+(end-start)+"ms");


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
