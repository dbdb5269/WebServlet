package test;

/**
 * Created by dubo on 16/11/30.
 */
public class Test {
    public static void main(String[] args) {
        Thread thread1=new Thread(new MyThread());
        Thread thread2=new Thread(new MyThread());
        Thread thread3=new Thread(new MyThread());


        try {
            thread1.start();
            thread1.sleep(200);
            thread2.start();
            thread2.sleep(200);
            thread3.start();
            thread3.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
