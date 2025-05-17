/**
 * Concrete Observer for SMS notifications.
 * Prints the SMS content to the console upon receiving an update.
 */
public class SMSObserver implements IObserver<String> {

    /**
     * Called by the subject when a new SMS notification is available.
     * Outputs the notification’s content to standard output.
     *
     * @param notification the Notification containing the SMS message
     */
    @Override
    public void update(Notification<String> notification) {
        System.out.println("SMSObserver received: " + notification.getContent());
    }
}