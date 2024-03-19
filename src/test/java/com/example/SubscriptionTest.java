package com.example;

import com.example.lifetime.LifetimeSubscriptionFactory;
import com.example.recurring.RecurringSubscriptionFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubscriptionTest {

    @Test
    void shouldGenerateLifetimeInvoice() {
        Subscription subscription = new Subscription(new LifetimeSubscriptionFactory());
        assertEquals("Lifetime invoice generated", subscription.generateInvoice());
    }

    @Test
    void shouldGenerateRecurringInvoice() {
        Subscription subscription = new Subscription(new RecurringSubscriptionFactory());
        assertEquals("Recurring invoice generated", subscription.generateInvoice());
    }

    @Test
    void shouldDescribeALifetimeCustomer() {
        Subscription subscription = new Subscription(new LifetimeSubscriptionFactory());
        assertEquals("Lifetime customer", subscription.describeCustomer());
    }

    @Test
    void shouldDescribeARecurringCustomer() {
        Subscription subscription = new Subscription(new RecurringSubscriptionFactory());
        assertEquals("Recurring customer", subscription.describeCustomer());
    }

    @Test
    void shouldProcessALifetimePayment() {
        Subscription subscription = new Subscription(new LifetimeSubscriptionFactory());
        assertEquals("Lifetime payment processed", subscription.processPayment());
    }

    @Test
    void shouldProcessARecurringPayment() {
        Subscription subscription = new Subscription(new RecurringSubscriptionFactory());
        assertEquals("Recurring payment processed", subscription.processPayment());
    }
}
