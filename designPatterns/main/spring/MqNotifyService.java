package main.spring;

public class MqNotifyService {
    public void sendMessage(String message) {
        System.out.println("Sending message by using mq method...");
        System.out.println("message:"+message);
    }
}
