/**
 * Demonstrates the functionality of the AlertSystem.
 *
 * The program sends notifications using multiple
 * notification services and displays the resulting log.
 *
 * @author Amane Godo
 * @version 1.0
 */
public class Demo {
    
    /**
     * Constructs a Demo object.
     */
    public Demo() {
    }

    /**
     * Entry point of the notification system demonstration.
     *
     * Creates an AlertSystem object, sends notifications
     * using different notification mediums, and displays
     * the notification log.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        AlertSystem as = new AlertSystem();

        String ms = "The first alert to the user";
        as.notifyUser(ms);

        as.setMedium(new SMSService());
        ms = "The second alert to the user";
        as.notifyUser(ms);

        as.displayLog();

        as = null;
    }
}