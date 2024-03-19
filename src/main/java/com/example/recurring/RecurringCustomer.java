package com.example.recurring;

import com.example.interfaces.Customer;

public class RecurringCustomer implements Customer {
    @Override
    public String describe() {
        return "Recurring customer";
    }
}
