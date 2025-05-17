/**
 * A concrete Notification implementation for email messages.
 */
public class EmailNotification extends Notification<String> {

    /**
     * Constructs a new EmailNotification with the given content.
     *
     * @param content the email message to wrap in this notification
     */
    public EmailNotification(String content) {
        // Pass the content to the base Notification class
        super(content);
    }
}