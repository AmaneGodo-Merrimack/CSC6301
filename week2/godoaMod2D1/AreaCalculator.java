import java.util.Scanner;

/**
 * Class to calculate the area of rectangles and triangles based on user input.
 *  
 * Note:
 * AI assistance was used with the query: 
 * Generate Javadoc descriptions for AreaCalculator methods and help debug Scanner input.
 * 
 * For CSC6301 Module 2 Discussion 
 * @author Amane Godo
 * @version 1.0.1
 * @since week 2 of CSC6301
 */

public class AreaCalculator {
    /**
     * Constructs an AreaCalculator object.
     */
    public AreaCalculator() {
    }

    /**
     * Runs the interactive area calculator program.
     * Prompts the user for their name, asks which shape to calculate,
     * collects the required dimensions, and prints the calculated area.
     *
     * @param args command-line arguments; not used
     * @since week2 of CSC6301
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String userName;
        int action;
        double x;
        double y;
        double area;

        
        System.out.println("Enter your name: ");
        userName = sc.next();
        
        while (true) {

            System.out.print("Calculate area: Press 1 for Rectangle, 2 for Triangle - ");

            if (sc.hasNextInt()) {

                action = sc.nextInt();

                if (action == 1 || action == 2) {
                    break;
                }
            } else {
                sc.next(); // discard invalid token
            }

            System.out.println("Invalid input. Try again.");
        }
        
        if (action == 1) {
            while (true) {

                System.out.print("Enter the length: ");

                if (sc.hasNextDouble()) {
                    x = sc.nextDouble();
                    break; 

                } else {
                    sc.next(); // discard invalid token
                }

                System.out.println("Invalid input. Try again.");
            }
            
            while (true) {

                System.out.print("Enter the width: ");

                if (sc.hasNextDouble()) {
                    y = sc.nextDouble();
                    break; 

                } else {
                    sc.next(); // discard invalid token
                }

                System.out.println("Invalid input. Try again.");
            }
            
            sc.close();

            area = calculateRectangleArea(x, y);
            System.out.println("Hello " + userName + ", the calculated area is: " + area);

        } else if (action == 2) {
            while (true) {

                System.out.print("Enter the base: ");

                if (sc.hasNextDouble()) {
                    x = sc.nextDouble();
                    break; 

                } else {
                    sc.next(); // discard invalid token
                }

                System.out.println("Invalid input. Try again.");
            }
            
            while (true) {

                System.out.print("Enter the height: ");

                if (sc.hasNextDouble()) {
                    y = sc.nextDouble();
                    break; 

                } else {
                    sc.next(); // discard invalid token
                }

                System.out.println("Invalid input. Try again.");
            }
            
            sc.close();

            area = calculateTriangleArea(x, y);
            System.out.println("Hello " + userName + ", the calculated area is: " + area);
        }
        
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area of the rectangle
     * @since week 2 of CSC6301
     */
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the area of a triangle.
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     * @return the area of the triangle
     * @since week 2 of CSC6301
     */
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
