package form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Created by dubo on 16/11/30.
 */
@WebServlet(name = "MethodServlet",urlPatterns = "/MethodServlet/*")
public class MethodServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost()");
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        System.out.println(name);
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("name= "+name);
        writer.flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet()");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
//        System.out.println("getContextPath = "+request.getContextPath());
//        System.out.println("getMethod = "+request.getMethod());
//        System.out.println("getPathInfo = "+request.getPathInfo());
//        //(1)direct get parameter
//        String name = request.getParameter("name");
//        String passWord = request.getParameter("password");
//        String[] job=request.getParameterValues("job");
//        if (job!=null){
//            for (String jobs:job){
//                System.out.print(jobs+",");
//            }
//            String n=job[0];
//            for (int i=1;i<job.length;i++){
//                n+=","+job[i];
//            }
//            System.out.println("job="+n);
//        }
//
//        System.out.println("name= "+name+"---"+"password= "+passWord);

//        Map<String, String[]> parameterMap = request.getParameterMap();
//        Set<String> set=parameterMap.keySet();
//        for (String s:set){
//            String[] str = parameterMap.get(s);
//            for (String string:str){
//                System.out.print("key:"+s+"value:"+string);
//            }
//            System.out.println();
//        }

//        Enumeration<String> enu = request.getParameterNames();
//        while (enu.hasMoreElements()){
//            String name=enu.nextElement();
//            System.out.println(name);
//
//        }


        String name = request.getParameter("name");
        System.out.println(name);

        PrintWriter writer = response.getWriter();
        writer.println("name= "+name);
        writer.flush();
    }
}
