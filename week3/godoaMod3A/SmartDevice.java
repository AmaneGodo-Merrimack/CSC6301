/**
 * Represents a generic smart device in a smart home.
 * Stores the device brand and power status.
 *
 * @author Amane Godo
 * @version 1.0
 */

public class SmartDevice {
    private String brand;
    private boolean powerOn;

    /**
     * Creates a SmartDevice with the specified brand.
     *
     * @param brand the manufacturer or brand of the device
     */
    public SmartDevice(String brand) {
        this.brand = brand;
        this.powerOn = false;
    }
    
    /**
     * Toggles the power state of the device between on and off.
     */
    public void togglePower() {
        powerOn = !powerOn;
        if (powerOn) {
            System.out.println(this.brand + " is now ON");
        } else {
            System.out.println(this.brand + " is now OFF");
        }
    }

    /**
     * Returns the brand of the device.
     *
     * @return the device brand
     */
    public String getBrand(){
        return brand;
    }
}