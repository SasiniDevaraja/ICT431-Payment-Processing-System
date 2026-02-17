/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentsystem;

/**
 *
 * @author sasini
 */
public class CreditCardPayment implements Payment {
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card charge of $" + amount);
        TransactionLogger.getInstance().log("Credit Card processed: " + amount);
    }
}
