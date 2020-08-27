//延迟加载，非线程安全
public class Singleton {
    //声明实例对象
    private static Singleton instance;
    //构造方法私有，防止外部类实例化对象
    private Singleton(){

    }
    //提供静态方法返回实例化对象
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return  instance;
    }
}
