package test;

/**
 * Created by dubo on 16/11/30.
 */
public class ServletSimple {
    private static ServletSimple ss=new ServletSimple();
    int a=5;
    public void doGet(){
        int b=5;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a--;
        b--;
        System.out.println("----------");

    }
    public static ServletSimple getInstance(){
        return ss;
    }

}
