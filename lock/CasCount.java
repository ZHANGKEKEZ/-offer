import java.util.concurrent.atomic.AtomicInteger;

public class CasCount {
    private static AtomicInteger count=new AtomicInteger(0);
    public static void increase(){
        count.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<1000;j++){
                        increase();
                    }
                }
            }).start();
        }
        Thread.sleep(100);
        System.out.println(count);
    }
}
