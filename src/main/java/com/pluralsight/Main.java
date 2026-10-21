package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = read.nextLine();

        System.out.print("Billing Street: ");
        String billingSteet = read.nextLine();

        System.out.print("Billing State: ");
        String billingState = read.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = read.nextLine();

        System.out.println();

        System.out.print("Shipping Street: ");
        String shippingStreet = read.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = read.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = read.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = read.nextLine();

        StringBuilder customerInfo = new StringBuilder();

        customerInfo.append(fullName);
        customerInfo.append("\n");
        customerInfo.append("\nBilling Address:\n");
        customerInfo.append(billingSteet);
        customerInfo.append(", ");
        customerInfo.append(billingState);
        customerInfo.append(" ");
        customerInfo.append(billingZip);

        customerInfo.append("\n\nShipping Address: \n");

        customerInfo.append(shippingStreet);
        customerInfo.append("\n");

        customerInfo.append(shippingCity);
        customerInfo.append(", ");
        customerInfo.append(shippingState);
        customerInfo.append(" ");
        customerInfo.append(shippingZip);





        System.out.println("Customer: " + fullName);
        System.out.println(customerInfo);

        read.close();

    }
}