public class ProductTest {
    public static void main(String[] args) {
        Notify httpnotify = NotifyProduct.getNotify("Httpnotify");
        httpnotify.sendMessage("hello!");
    }
}
