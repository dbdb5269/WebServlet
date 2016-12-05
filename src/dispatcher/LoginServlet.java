package dispatcher;

import form.User;
import form.UserDaoImp;

import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");

        String password = request.getParameter("password");
        request.getSession().setAttribute("user","sessionName");
        request.getRequestDispatcher("test.jsp").forward(request,response);

//        UserDaoImp userDaoImp=new UserDaoImp();
//        User user=null;
//        try {
//            user = userDaoImp.find(name);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        if (user==null){
//            response.sendRedirect("login.html");
//        }else if(user.getPassword().equals(password)){
//            response.sendRedirect("information.html");
//        }
//        else {
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.html"); //相对路径
//            requestDispatcher.forward(request,response);
//            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/login.html"); //绝对路径 ／从工程名开始
//            requestDispatcher.forward(request,response);
//            response.sendRedirect("/login.html");
//            response.sendRedirect("register.html");
//
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
