package scope;

import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "RequestServlet",urlPatterns = "/RequestServlet")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("RequestServlet-----------");
        request.setAttribute("name","123");
        request.setAttribute("name","1234");
        request.removeAttribute("name");
//        HttpSession session = request.getSession();
//        String name1 = (String)session.getAttribute("name");
//        System.out.println(name1);
//        request.setAttribute("name","tom");
//        String name = (String)request.getAttribute("name");
//        System.out.println("name.getParameter:"+request.getParameter("name"));
//        System.out.println("name = "+ name);

//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("TestRequestServlet");
//        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
