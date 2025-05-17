/**
 * Factory interface for creating Notification instances.
 *
 * @param <T> the type of content carried by the Notification
 */
public interface INotificationFactory<T> {

    /**
     * Creates a new Notification wrapping the given content.
     *
     * @param content the payload for the notification
     * @return a Notification instance containing the specified content
     */
    Notification<T> createNotification(T content);
}