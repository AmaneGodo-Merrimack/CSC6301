/**
 * Sends notifications through an SMS service.
 *
 * This class implements the NotificationMedium interface and
 * delivers messages using text messaging.
 *
 * @author Amane Godo
 * @version 1.0
 */
public class SMSService implements NotificationMedium {
    /**
     * Constructs an SMSService object.
     */
    public SMSService() {
    }

    /**
     * Sends a message using the SMS notification service.
     *
     * @param message the message to be delivered
     */
    @Override
    public void send(String message) {
        System.out.println(message + " sent via SMS.");
    }

}