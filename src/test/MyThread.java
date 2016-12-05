package test;

/**
 * Created by dubo on 16/11/30.
 */
public class MyThread implements Runnable {
    ServletSimple ss=ServletSimple.getInstance();
    @Override
    public void run() {
        ss.doGet();
    }
}
