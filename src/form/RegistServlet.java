package form;

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
@WebServlet(name = "RegistServlet",urlPatterns = "/RegistServlet")
public class RegistServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String[] jobs = request.getParameterValues("job");
        String s=null;
        if (jobs!=null){
            s=jobs[0];
            for (int i=1;i<jobs.length;i++){
                s+=","+jobs[i];
            }
        }
        String gender = request.getParameter("sex");

        int age = Integer.parseInt(request.getParameter("age"));
        User user=new User(name,password,age,gender,s);

        UserDaoImp userDaoImp = new UserDaoImp();
        try {
            userDaoImp.SavaUser(user);
            response.sendRedirect("login.html");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
