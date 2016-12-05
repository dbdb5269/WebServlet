package scope;

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
@WebServlet(name = "SessionServlet",urlPatterns = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //false 不会创建新的session对象
        HttpSession session=request.getSession(true);
        session.setAttribute("session","SessionValue");
        session.setAttribute("session","newSessionValue");
        session.removeAttribute("session");
        //session 手动
        // 失效

//        session.invalidate();
        // 10s
        session.setMaxInactiveInterval(10);
        System.out.println(session);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
