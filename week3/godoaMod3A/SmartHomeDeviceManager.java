/**
 * Demonstrates the Smart Home Device system by creating and interacting with smart devices.
 *
 * @author Amane Godo
 * @version 1.0
 */
public class SmartHomeDeviceManager {
    
    /**
     * Creates a SmartHomeDeviceManager object.
     */
    public SmartHomeDeviceManager() {
    }

    /**
     * Entry point of the program.
     * Creates a smart light and demonstrates its functionality.
     *
     * @param args command-line arguments not used by this program
     */
    public static void main(String[] args) {
        SmartLight lightOne = new SmartLight("Philips", 50);

        lightOne.togglePower();
        System.out.println("Brightness Level: " + Integer.toString(lightOne.getBrightnessLevel()));
        lightOne.connectToWiFi();
    }
}