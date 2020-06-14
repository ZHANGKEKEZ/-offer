//静态内部类的方法
//第一次调用getInstance方法时，第一次读取Builder.instance，Builder类初始化
//类在加载并初始化时，会初始化它的静态域，从而创建Singleton的实例
// 由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性
public class Singleton4 {
    private Singleton4(){

    }
    private static class Builder{
        private static Singleton4 instance=new Singleton4();
    }
    public static Singleton4 getInstance(){
        return Builder.instance;
    }
}
