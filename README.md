# Payment Processing System (ICT431-2)

## Overview
This is a Java-based console application developed for the **Object Oriented Design Patterns and Principles** module (ICT431-2). The system simulates a backend payment processor for an e-commerce platform, handling different payment methods dynamically while maintaining a secure audit log.

## Features
* **Dynamic Payment Processing:** Supports Credit Card and PayPal payments.
* **Transaction Logging:** Automatically records all transactions to a log file (`transactions.txt`) with timestamps.
* **Console Interface:** Simple CLI for user interaction.

## Design Patterns Implemented
This project demonstrates the practical application of two key design patterns:
1.  **Singleton Pattern:** Used for the `TransactionLogger` class to ensure a single, synchronized logging instance.
2.  **Factory Method Pattern:** Used for the `PaymentFactory` class to decouple the creation of payment objects from the main application logic.

## Project Structure
```text
src/
└── paymentsystem/
    ├── MainApp.java           # Entry point
    ├── Payment.java           # Product Interface
    ├── CreditCardPayment.java # Concrete Product 1
    ├── PayPalPayment.java     # Concrete Product 2
    ├── PaymentFactory.java    # Factory Class
    └── TransactionLogger.java # Singleton Logger
