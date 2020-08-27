package main.spring;

public class NotifyService {
    private HttpNotifyService httpNotifyService=(HttpNotifyService)BeanFactory.getBean("httpNotifyService");
    private MqNotifyService mqNotifyService=(MqNotifyService)BeanFactory.getBean("mqNotifyService");

    public void sendMessage(String message,int status) {
        if(status==1){
            httpNotifyService.sendMessage(message);
        }else{
            mqNotifyService.sendMessage(message);
        }
    }
}
