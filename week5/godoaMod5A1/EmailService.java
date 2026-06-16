/**
 * Sends notifications through an email service.
 *
 * This class implements the NotificationMedium interface and
 * delivers messages using email.
 *
 * @author Amane Godo
 * @version 1.0
 */

public class EmailService implements NotificationMedium {
    /**
     * Constructs an EmailService object.
     */
    public EmailService() {
    }

    /**
     * Sends a message using the email notification service.
     *
     * @param message the message to be delivered
     */
    @Override
    public void send(String message) {
        System.out.println("[Email] Sending message: " + message);
    }
}