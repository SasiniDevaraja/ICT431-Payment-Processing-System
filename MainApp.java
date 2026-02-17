/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentsystem;

/**
 *
 * @author sasini
 */
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=== Payment Processing System ===");
        
        while (running) {
            System.out.println("\nSelect Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            String choice = scanner.nextLine();
            
            if (choice.equals("3")) {
                running = false;
                System.out.println("System shutting down...");
                continue;
            }
            
            Payment payment = PaymentFactory.createPayment(choice);
            
            if (payment != null) {
                System.out.print("Enter amount to pay: ");
                try {
                    double amount = Double.parseDouble(scanner.nextLine());
                    payment.processPayment(amount);
                    System.out.println("Transaction completed successfully.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid amount entered.");
                }
            } else {
                System.out.println("Invalid payment type selected.");
            }
        }
        scanner.close();
    }
}
