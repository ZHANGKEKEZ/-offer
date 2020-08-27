import java.util.concurrent.atomic.AtomicInteger;

public class CAS {
    private static AtomicInteger a=new AtomicInteger(5);

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                a.compareAndSet(5,10);
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                a.compareAndSet(5,6);
            }
        });
        t2.start();
        Thread.sleep(100);
        t1.start();
        System.out.println(a);
    }
}
