package scope;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by dubo on 16/12/2.
 */
@WebServlet(name = "TestRequestServlet",urlPatterns = "/TestRequestServlet")
public class TestRequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name=(String) request.getAttribute("name");
//        System.out.println("request"+name);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("test.jsp");
//        requestDispatcher.forward(request,response);
        HttpSession session=request.getSession();
        String attribute = (String) session.getAttribute("session");
        System.out.println(attribute);
        ServletContext servletContext = request.getServletContext();
        String app = (String) servletContext.getAttribute("app");
        System.out.println("app"+app);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
