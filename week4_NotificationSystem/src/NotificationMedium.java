/**
 * Defines a notification service capable of sending messages
 * through a specific communication medium.
 *
 * Implementing classes determine how the message is delivered,
 * such as email or SMS.
 *
 * @author Amane Godo
 * @version 1.0
 */

public interface NotificationMedium {
     /**
     * Sends a notification message using the implementing service.
     *
     * @param message the message to be delivered
     */
    public void send(String message);
}