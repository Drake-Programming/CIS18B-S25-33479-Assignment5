/**
 * Observer interface in the Observer pattern.
 * Implementers will receive updates when a Notification is published.
 *
 * @param <T> the type of content this observer handles
 */
public interface IObserver<T> {

    /**
     * Called by the subject when a new notification is available.
     *
     * @param message the Notification carrying the update content
     */
    void update(Notification<T> message);
}