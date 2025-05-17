/**
 * Base class representing a generic notification carrying content of type T.
 *
 * @param <T> the type of the payload contained in the notification
 */
public abstract class Notification<T> {
    /** The payload carried by this notification. */
    private final T content;

    /**
     * Constructs a new Notification with the specified content.
     *
     * @param content the data to wrap in this notification
     */
    public Notification(T content) {
        this.content = content;
    }

    /**
     * Retrieves the content payload of this notification.
     *
     * @return the content carried by this notification
     */
    public T getContent() {
        return content;
    }
}