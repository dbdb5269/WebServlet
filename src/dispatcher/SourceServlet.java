package dispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dubo on 16/12/1.
 */
@WebServlet(name = "SourceServlet",urlPatterns = "/SourceServlet")
public class SourceServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String name=request.getParameter("name");
        System.out.println("SourceServlet "+name);
        PrintWriter writer = response.getWriter();
        writer.println("SourceServlet to TargetServlet");
        request.getRequestDispatcher("/TargetServlet").include(request,response);
        writer.flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
