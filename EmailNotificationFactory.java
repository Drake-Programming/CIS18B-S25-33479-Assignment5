import java.util.ArrayList;
import java.util.List;

/**
 * Factory and Subject for EmailNotification, implementing both creation
 * and the Observer pattern to notify subscribers of new notifications.
 */
public class EmailNotificationFactory
        implements INotificationFactory<String>, ISubject<String> {

    /**
     * Internal list of observers subscribed to receive notifications.
     */
    private final List<IObserver<String>> observers = new ArrayList<>();

    /**
     * Creates a new email notification carrying the specified content.
     *
     * @param content the message content for the email notification
     * @return a new instance of EmailNotification wrapping the content
     */
    @Override
    public Notification<String> createNotification(String content) {
        return new EmailNotification(content);
    }

    /**
     * Registers an observer to receive future notifications.
     *
     * @param observer the observer to add
     */
    @Override
    public void registerObserver(IObserver<String> observer) {
        observers.add(observer);
    }

    /**
     * Unregisters an observer so it will no longer receive notifications.
     *
     * @param observer the observer to remove
     */
    @Override
    public void removeObserver(IObserver<String> observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers of a new notification event.
     *
     * @param notification the notification to broadcast
     */
    @Override
    public void notifyObservers(Notification<String> notification) {
        // Iterate through all observers and push the update
        for (IObserver<String> observer : observers) {
            observer.update(notification);
        }
    }
}