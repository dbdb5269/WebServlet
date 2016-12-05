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
@WebServlet(name = "URLServlet",urlPatterns = "/URLServlet")
public class URLServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String scheme = request.getScheme();
        String serverName = request.getServerName();
        int serverPort = request.getServerPort();
        String path = request.getServletContext().getContextPath();
        System.out.println(scheme);
        System.out.println(serverName);
        System.out.println(serverPort);
        System.out.println(path);
        String url=scheme+"://"+serverName+":"+serverPort+"/";
        System.out.println(url);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
