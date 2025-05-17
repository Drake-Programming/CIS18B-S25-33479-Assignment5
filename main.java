/**
 * Entry point for demonstrating the generic notification system.
 *
 * Creates and dispatches both email and SMS notifications to
 * observers who have registered interest in each channel.
 */
public class main {

    /**
     * Main method to build notifications, register observers, and
     * broadcast messages.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a builder to construct notifications
        NotificationBuilder<String> builder = new NotificationBuilder<>();

        // === Email Notification Setup ===
        // Initialize the email notification factory (subject)
        EmailNotificationFactory emailFactory = new EmailNotificationFactory();
        // Build an email notification with the welcome message
        Notification<String> email = builder
                .setContent("Welcome to MarketBridge!")
                .build(emailFactory);

        // === SMS Notification Setup ===
        // Initialize the SMS notification factory (subject)
        SMSNotificationFactory smsFactory = new SMSNotificationFactory();
        // Build an SMS notification with the shipment message
        Notification<String> sms = builder
                .setContent("Your order has shipped!")
                .build(smsFactory);

        // === Observer Instances ===
        // Users subscribed to both SMS and Email
        SMSObserver user1SMS = new SMSObserver();
        EmailObserver user1Email = new EmailObserver();
        SMSObserver user2SMS = new SMSObserver();
        EmailObserver user2Email = new EmailObserver();

        // Users subscribed only to SMS
        SMSObserver user3SMS = new SMSObserver();
        SMSObserver user5SMS = new SMSObserver();

        // Users subscribed only to Email
        EmailObserver user4Email = new EmailObserver();
        EmailObserver user6Email = new EmailObserver();

        // === Register Observers ===
        // Register email observers to receive email notifications
        emailFactory.registerObserver(user1Email);
        emailFactory.registerObserver(user2Email);
        emailFactory.registerObserver(user4Email);
        emailFactory.registerObserver(user6Email);

        // Register SMS observers to receive SMS notifications
        smsFactory.registerObserver(user1SMS);
        smsFactory.registerObserver(user2SMS);
        smsFactory.registerObserver(user3SMS);
        smsFactory.registerObserver(user5SMS);

        // === Dispatch Notifications ===
        // Notify all registered email observers
        emailFactory.notifyObservers(email);
        // Notify all registered SMS observers
        smsFactory.notifyObservers(sms);
    }
}