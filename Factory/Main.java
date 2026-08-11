/**
 * Define an interface for creating an object, but let subclasses or a factory determine which class to instantiate.
 */
public class Main {
    public static void main(String[] args) {
        Notification nf = NotificationFactory.getNotification("email");
        nf.send();
    }
}