
import java.util.Scanner;
public class shapecalculator {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Select a shape
        System.out.println("Select a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int shapeChoice = scanner.nextInt();

        // Check if user wants to continue
        System.out.print("Would you like to continue? (Yes/no): ");
        String continueChoice = scanner.next().toLowerCase();
        if (!continueChoice.equals("yes")) {
            System.out.println("Thank you for using the system");
            scanner.close();
            return;
        }

        // Proceed with calculation for Rectangle (example)
        if (shapeChoice == 1) {
            System.out.println("What would you like to calculate?");
            System.out.println("A. Area");
            System.out.println("B. Perimeter");
            System.out.print("Enter your choice (A/B): ");
            char calcChoice = scanner.next().toUpperCase().charAt(0);

            if (calcChoice == 'A') {
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double area = length * width;
                System.out.println("The area of the rectangle is: " + area);
            } else if (calcChoice == 'B') {
                System.out.println("Perimeter calculation for Rectangle not implemented yet.");
            } else {
                System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Only Rectangle calculation is implemented for now.");
        }

        System.out.println("Thank you for using the system");
        scanner.close();}
}