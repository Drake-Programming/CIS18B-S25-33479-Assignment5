import java.util.ArrayList;
import java.util.List;

/**
 * Factory and Subject for SMSNotification, combining creation of SMS notifications
 * with the Observer pattern to broadcast messages to subscribers.
 */
public class SMSNotificationFactory
        implements INotificationFactory<String>, ISubject<String> {

    /**
     * Internal list of observers subscribed to receive SMS notifications.
     */
    private final List<IObserver<String>> observers = new ArrayList<>();

    /**
     * Creates a new SMSNotification instance carrying the specified content.
     *
     * @param content the message content for the SMS notification
     * @return a new SMSNotification wrapping the given content
     */
    @Override
    public Notification<String> createNotification(String content) {
        return new SMSNotification(content);
    }

    /**
     * Registers an observer to receive future SMS notifications.
     *
     * @param observer the observer to add
     */
    @Override
    public void registerObserver(IObserver<String> observer) {
        observers.add(observer);
    }

    /**
     * Unregisters an observer so it will no longer receive SMS notifications.
     *
     * @param observer the observer to remove
     */
    @Override
    public void removeObserver(IObserver<String> observer) {
        observers.remove(observer);
    }

    /**
     * Broadcasts the given notification to all registered observers.
     *
     * @param notification the SMS notification to send
     */
    @Override
    public void notifyObservers(Notification<String> notification) {
        // Iterate over all observers and invoke their update method
        for (IObserver<String> observer : observers) {
            observer.update(notification);
        }
    }
}