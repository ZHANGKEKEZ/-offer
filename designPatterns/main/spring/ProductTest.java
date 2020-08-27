package main.spring;

public class ProductTest {
    public static void main(String[] args) {
        NotifyService notifyService=new NotifyService();
        notifyService.sendMessage("hello",1);
    }
}
