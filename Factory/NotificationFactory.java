public class NotificationFactory {
    private NotificationFactory () {}

    public static Notification getNotification (String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        }
        if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }

        throw new IllegalArgumentException("Unknown notification type");
    }
}