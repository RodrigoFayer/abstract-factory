package com.example.interfaces;

public interface SubscriptionFactory {
    Customer createCustomer();
    Invoice createInvoice();
    Payment createPayment();
}
