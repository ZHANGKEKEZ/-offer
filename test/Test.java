public class Test {
    public static void main(String[] args) {
        Singleton4 s=Singleton4.getInstance();
        Singleton4 b=Singleton4.getInstance();
        System.out.println(s==b);
    }
}
