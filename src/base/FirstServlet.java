package base;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by dubo on 16/11/29.
 */
public class FirstServlet implements Servlet{

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("FirstServlet.init()");
        Enumeration<String> enu=servletConfig.getInitParameterNames();
        while (enu.hasMoreElements()){
            String name=enu.nextElement();
            String value=servletConfig.getInitParameter(name);
            System.out.println("name="+name+"value"+value);

        }
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("FirstServlet.service()");
        servletResponse.setContentType("text/html,charset=utf-8");
        double random=Math.random()*6;
        PrintWriter out=servletResponse.getWriter();
        out.write("<html><body><p>First</p>");
        if (random>3){
            out.println("<p>>3</p>");
        }else {
            out.println("<p><3</p>");
        }
        out.println(random+"</body></html>");
        out.flush();
        out.close();
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("FirstServlet.destroy()");
    }
}
