package base;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dubo on 16/11/29.
 */
public class SecondServlet extends GenericServlet {
    public SecondServlet() {
        System.out.println("constructor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //makesure the file type is xml
        servletResponse.setContentType("text/xml");
        PrintWriter out=servletResponse.getWriter();
        out.println("<students><student id='1'>");
        out.println("<name>dubo</name><age>21</age><gender>male</gender></student>");
        out.println("<student id='2'>");
        out.println("<name>dub2o</name><age>22</age><gender>male</gender></student>");
        out.println("</students>");
    }
}
