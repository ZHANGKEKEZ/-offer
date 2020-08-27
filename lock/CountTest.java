public class CountTest {
    private static int count=0;
    public synchronized static void increase(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<1000;j++){
                        increase();
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(count);
    }
}
