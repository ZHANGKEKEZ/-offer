//通知类工厂
public class NotifyProduct {
    public static Notify getNotify(String notify){
        if(notify.equalsIgnoreCase("MqNotify")){
            return new MqNotify();
        }
        if(notify.equalsIgnoreCase("HttpNotify")){
            return new HttpNotify();
        }
        return null;
    };
}

