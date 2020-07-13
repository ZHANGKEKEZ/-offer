//消息通知类
public class MqNotify extends Notify {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message by using mq method...");
        System.out.println("message:"+message);
    }
}
