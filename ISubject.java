/**
 * Subject interface in the Observer pattern.
 * Manages registration and notification of observers.
 *
 * @param <T> the type of content carried in the Notifications
 */
public interface ISubject<T> {

    /**
     * Registers an observer to receive future notifications.
     *
     * @param o the observer to add
     */
    void registerObserver(IObserver<T> o);

    /**
     * Unregisters an observer so it will no longer receive notifications.
     *
     * @param o the observer to remove
     */
    void removeObserver(IObserver<T> o);

    /**
     * Notifies all currently registered observers with the given notification.
     *
     * @param message the Notification to broadcast
     */
    void notifyObservers(Notification<T> message);
}