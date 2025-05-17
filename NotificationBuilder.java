/**
 * Builder for creating Notification instances using a specified factory.
 *
 * Allows setting optional fields (here, only content) before constructing
 * the final Notification via an INotificationFactory.
 *
 * @param <T> the type of content to build into a notification
 */
public class NotificationBuilder<T> {
    /** The content to include in the next notification. */
    private T content;

    /**
     * Sets the content for the next notification to be built.
     *
     * @param content the payload to include
     * @return this builder instance for method chaining
     */
    public NotificationBuilder<T> setContent(T content) {
        this.content = content;
        return this;
    }

    /**
     * Builds a Notification by delegating to the provided factory.
     *
     * @param factory the factory responsible for creating the Notification
     * @return a new Notification instance containing the previously set content
     */
    public Notification<T> build(INotificationFactory<T> factory) {
        return factory.createNotification(content);
    }
}