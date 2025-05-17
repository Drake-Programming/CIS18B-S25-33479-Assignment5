/**
 * A concrete Notification implementation for SMS messages.
 */
public class SMSNotification extends Notification<String> {

    /**
     * Constructs a new SMSNotification with the given content.
     *
     * @param content the SMS message to wrap in this notification
     */
    public SMSNotification(String content) {
        // Delegate storage of content to the base Notification class
        super(content);
    }
}