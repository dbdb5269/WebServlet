package scope;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dubo on 16/12/2.
 */
@WebServlet(name = "CookieServlet",urlPatterns = "/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getSession().getId());
        Cookie[] cookies = request.getCookies();
        if (cookies!=null){
            for (Cookie cookie:cookies){
                System.out.println(cookie.getName());
                System.out.println(cookie.getValue());
            }
        }

//        Cookie cookie=new Cookie("name","Tome");
//        Cookie cookie2=new Cookie("pwd","123");
//        cookie.setMaxAge(60*60);
//        cookie2.setMaxAge(60*60);
//        response.addCookie(cookie);
//        response.addCookie(cookie2);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
