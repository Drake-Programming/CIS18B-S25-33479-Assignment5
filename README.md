## CIS18B-S25-33479-Assignment5

### Overview
This repository contains Java source code for a small demo that showcases several advanced object-oriented design techniques and Java generics features, including:

- **Observer Pattern** (subjects broadcast Notification<T> objects to all registered observers without exposing their internal lists)
- **Abstract Factory Pattern** (EmailNotificationFactory and SMSNotificationFactory create channel-specific notifications while sharing a common interface)
- **Builder Pattern** (NotificationBuilder<T> constructs notifications with optional fields and fluent syntax)
- **Generics & Bounded Wildcards** (all core interfaces/classes are generic, allowing the same logic to work for any content type)

The project models a simple notification service where a main routine:
- builds email and SMS notifications
- registers users who subscribed to one or both channels
- sends each notification to the correct observers, who react by printing a confirmation message
  
### Cloning the Repository
To copy this project, use the following command:

```bash
git clone https://github.com/Drake-Programming/CIS18B-S25-33479-Assignment5.git
```

To compile and run the code from the terminal, use the following commands:

```bash
javac main.java
java main
```

### Project Structure
```
src/
│
├── Main.java                      // ***Entry point*** (builds & sends notifications)
│
├── Notification.java              // Generic base class holding content
├── EmailNotification.java         // Email-specific concrete notification
├── SMSNotification.java           // SMS-specific concrete notification
│
├── ISubject.java                  // Subject interface (Observer pattern)
├── IObserver.java                 // Observer interface
├── EmailObserver.java             // Concrete observer for email channel
├── SMSObserver.java               // Concrete observer for SMS channel
│
├── INotificationFactory.java      // Abstract factory interface
├── EmailNotificationFactory.java  // Factory + subject for email
├── SMSNotificationFactory.java    // Factory + subject for SMS
│
└── NotificationBuilder.java       // Fluent builder for constructing notifications

```

### Main Execution
The entry point of the application is the main.java file.

### Expected Behavior
- **Observer Registration**: Users are attached to either or both subjects (EmailNotificationFactory, SMSNotificationFactory).
- **Notification Dispatch**: Each factory broadcasts its Notification<String> to its own observer list.
- **Console Output**: For every observer, a line appears such as
EmailObserver received: Welcome to MarketBridge!
or
SMSObserver received: Your order has shipped!
 
---

*Author:* Drake Programming
