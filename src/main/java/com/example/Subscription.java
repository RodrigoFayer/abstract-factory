package com.example;

import com.example.interfaces.Customer;
import com.example.interfaces.Invoice;
import com.example.interfaces.Payment;
import com.example.interfaces.SubscriptionFactory;

public class Subscription {
    private Customer customer;
    private Invoice invoice;
    private Payment payment;

    public Subscription(SubscriptionFactory factory) {
        this.customer = factory.createCustomer();
        this.invoice = factory.createInvoice();
        this.payment = factory.createPayment();
    }

    public String describeCustomer() {
        return customer.describe();
    }

    public String generateInvoice() {
        return invoice.generate();
    }

    public String processPayment() {
        return payment.process();
    }
}
