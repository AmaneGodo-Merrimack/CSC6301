import java.util.ArrayList;

/**
 * Manages notifications by delegating message delivery
 * to a selected notification medium.
 *
 * The notification medium can be changed during runtime
 * using the setMedium method.
 *
 * @author Amane Godo
 * @version 1.0
 */
public class AlertSystem {
    /**
     * The currently active notification medium.
     */
    private NotificationMedium medium;

    /**
     * Stores all notification messages sent during execution.
     */
    private ArrayList<String> log;

    /**
     * Constructs an AlertSystem object with EmailService
     * as the default notification medium.
     */
    public AlertSystem() {
        medium = new EmailService();
        log = new ArrayList<>();
    }

    /**
     * Changes the active notification medium.
     *
     * @param medium the notification service to be used
     *               for future messages
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a notification message using the currently
     * selected notification medium and stores the message
     * in the notification log.
     *
     * @param message the notification message to send
     */
    public void notifyUser(String message) {
        this.medium.send(message);
        this.log.add(message);
    }

    /**
     * Displays all notification messages stored in the log.
     */
    public void displayLog() {
        System.out.println(this.log);
    }
}   