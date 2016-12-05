package scope;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dubo on 16/12/2.
 */
@WebServlet(name = "ApplicationServlet",urlPatterns = "/ApplicationServlet")
public class ApplicationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context1=request.getServletContext();
//        ServletContext context2=this.getServletContext();
//        ServletContext context3=request.getSession().getServletContext();
//        ServletContext context4=this.getServletConfig().getServletContext();

        context1.setAttribute("app","appValue");
        context1.setAttribute("app","appValue");
        context1.removeAttribute("app");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
