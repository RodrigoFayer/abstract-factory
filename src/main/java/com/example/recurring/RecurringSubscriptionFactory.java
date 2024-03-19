package com.example.recurring;

import com.example.interfaces.*;

public class RecurringSubscriptionFactory implements SubscriptionFactory {
    @Override
    public Customer createCustomer() {
        return new RecurringCustomer();
    }

    @Override
    public Invoice createInvoice() {
        return new RecurringInvoice();
    }

    @Override
    public Payment createPayment() {
        return new RecurringPayment();
    }
}
