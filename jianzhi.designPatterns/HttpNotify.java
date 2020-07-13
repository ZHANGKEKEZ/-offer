//网页回调通知类
public class HttpNotify extends Notify{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message by using http callback method...");
        System.out.println("message:"+message);
    }
}
