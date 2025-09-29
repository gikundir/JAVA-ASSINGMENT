package AssignmentDay2;
import java.util.Scanner;

public class supermarketBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many different items did the customer buy? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] itemNames = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double[] subtotals = new double[n];

        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of item " + (i + 1) + ": ");
            itemNames[i] = scanner.nextLine();

            System.out.print("Enter price per unit of " + itemNames[i] + ": ");
            prices[i] = scanner.nextDouble();

            System.out.print("Enter quantity of " + itemNames[i] + ": ");
            quantities[i] = scanner.nextInt();
            scanner.nextLine(); 
            subtotals[i] = prices[i] * quantities[i];
            total += subtotals[i];
        }
        double discount = 0;
        if (total> 50000) {
            discount = total * 0.05;
        }
        double finalAmount = total - discount;
        System.out.println("Receipt");
        System.out.println("Item Name      | Quantity | Price per unit | subtotal");
        System.out.println();
        for (int i = 0; i < n; i++) {
        	System.out.println(itemNames[i] +        " | "         + quantities[i] +          " | "         + prices[i] +        " | "           
        	+ subtotals[i]);
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("Grand amount:"+total);
        System.out.println("Discount applied:"+discount);
        System.out.println("Final amount:"+finalAmount);

        scanner.close();
    }
}
