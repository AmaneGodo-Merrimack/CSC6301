/**
 * Represents a smart light that can connect to WiFi.
 * Inherits common device properties from SmartDevice.
 *
 * @author Amane Godo
 * @version 1.0
 */

public class SmartLight extends SmartDevice implements Connectable{
    private int brightnessLevel;

    /**
     * Creates a SmartLight with the specified brand and brightness level.
     *
     * @param brand the manufacturer or brand of the light
     * @param brightnessLevel the brightness level of the light
     */
    public SmartLight(String brand, int brightnessLevel) {
        super(brand);
        this.brightnessLevel = brightnessLevel;
    }

    public int getBrightnessLevel() {
        return brightnessLevel;
    }
    /**
     * Connects the smart light to a WiFi network.
     */
    @Override
    public void connectToWiFi() {
        System.out.println(getBrand() + " is now connected to WiFi");
    }
}