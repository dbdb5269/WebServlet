package base;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by dubo on 16/11/30.
 */
@WebServlet(name = "TestServlet",urlPatterns = {"/TestServlet","/Testservlet"},
        initParams = {@WebInitParam(name = "version",value = "3.0"),
                @WebInitParam(name="author",value = "jack")},loadOnStartup = 2)
public class TestServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Enumeration<String> enu = config.getInitParameterNames();
        while (enu.hasMoreElements()){
            String name=enu.nextElement();
            String value=config.getInitParameter(name);
            System.out.println("name= "+name);
            System.out.println("value= "+value);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");
        double random=Math.random()*6;
        PrintWriter out=response.getWriter();
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
}
