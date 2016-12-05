package homework;

import form.User;
import form.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dubo on 16/12/1.
 */
@WebServlet(name = "ShowAllCustomerServlet",urlPatterns = "/ShowAllCustomerServlet")
public class ShowAllCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        UserDaoImp userDaoImp=new UserDaoImp();
        List<User> userList=null;
        try {
            userList = userDaoImp.findAllUser();
            System.out.println("userList = "+userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userList!=null){
            Iterator<User> iterator = userList.iterator();
            while (iterator.hasNext()){
                User user = iterator.next();
                PrintWriter writer = response.getWriter();
                System.out.println(user.getName());
                writer.println(user.getName());
            }
        }else {
            PrintWriter writer = response.getWriter();
            writer.println("null");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
