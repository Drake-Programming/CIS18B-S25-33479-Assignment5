/**
 * Concrete Observer that reacts to String-based notifications by
 * printing their content to the console.
 */
public class EmailObserver implements IObserver<String> {

    /**
     * Called by the Subject when a new notification is available.
     * Prints out the content of the notification.
     *
     * @param notification the notification containing the email message
     */
    @Override
    public void update(Notification<String> notification) {
        System.out.println("EmailObserver received: " + notification.getContent());
    }
}