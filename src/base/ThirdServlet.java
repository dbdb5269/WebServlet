package base;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by dubo on 16/11/29.
 */
public class ThirdServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("image/jpg");

        File file=new File("./1.jpg");
//        File file1=new File("./");
//        System.out.println(file1.getParent());
        String path=req.getServletContext().getRealPath("/");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(resp.getOutputStream());
        byte[] buff=new byte[1024];
        int len=-1;
        while ((len=bufferedInputStream.read(buff))!=-1){
            bufferedOutputStream.write(buff,0,len);
            bufferedOutputStream.flush();
        }
        bufferedOutputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
