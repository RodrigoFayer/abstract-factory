package com.example.lifetime;

import com.example.interfaces.Customer;
import com.example.interfaces.Invoice;
import com.example.interfaces.Payment;
import com.example.interfaces.SubscriptionFactory;

public class LifetimeSubscriptionFactory implements SubscriptionFactory {
    @Override
    public Customer createCustomer() {
        return new LifetimeCustomer();
    }

    @Override
    public Invoice createInvoice() {
        return new LifetimeInvoice();
    }

    @Override
    public Payment createPayment() {
        return new LifetimePayment();
    }
}
