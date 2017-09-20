package murach.invoice;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (!choice.equalsIgnoreCase("n")) {
            // get the input from the user
            System.out.print("Enter customer type (r/c/t): ");
            String customerType = sc.nextLine();
            customerType = customerType.toLowerCase();
            System.out.print("Enter subtotal:   ");
            double subtotal = Double.parseDouble(sc.nextLine());

            // get the discount percent
            double discountPercent = 0.1;
            switch (customerType) {
            case "R":
            case "r":
                if (subtotal >= 250 && subtotal < 500) {
                    discountPercent = 0.2;
                }
                else if (subtotal >= 500) {
                    discountPercent = 0.3;
                }
                break;
            case "C":
            case "c":
                discountPercent = 0.3;
                break;
            case "t":
            case "T":
                if (subtotal < 500) {
                    discountPercent = 0.4;
                } else {
                    discountPercent = 0.5;
                }
                break;
            default:
                discountPercent = 0.0;
                break;
            }

            // calculate the discount amount and total
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                    "Discount percent: " + percent.format(discountPercent) + "\n"
                    + "Discount amount:  " + currency.format(discountAmount) + "\n"
                    + "Total:            " + currency.format(total) + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}