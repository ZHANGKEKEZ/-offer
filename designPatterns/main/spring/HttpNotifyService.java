package main.spring;

public class HttpNotifyService {
    public void sendMessage(String message) {
        System.out.println("Sending message by using http callback method...");
        System.out.println("message:"+message);
    }
}
