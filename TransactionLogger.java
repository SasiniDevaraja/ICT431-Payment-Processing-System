/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentsystem;

/**
 *
 * @author sasini
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class TransactionLogger {
    
    private static TransactionLogger instance;
    private static final String LOG_FILE = "transactions.txt";
    
    private TransactionLogger() {}
    
    public static synchronized TransactionLogger getInstance() {
        if (instance == null) {
            instance = new TransactionLogger();
        }
        return instance;
    }
    
    public void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(LocalDateTime.now() + " - " + message);
            System.out.println("Log recorded.");
        } catch (IOException e) {
            System.out.println("Error writing to log file.");
        }
    }
}
