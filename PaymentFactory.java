/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentsystem;

/**
 *
 * @author sasini
 */
public class PaymentFactory {
    
    public static Payment createPayment(String type) {
        if (type.equalsIgnoreCase("1")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("2")) {
            return new PayPalPayment();
        }
        return null;
    }
}
