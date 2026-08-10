public class Main {
    public static void main(String[] args) {
        Notification nf = NotificationFactory.getNotification("email");
        nf.send();
    }
}