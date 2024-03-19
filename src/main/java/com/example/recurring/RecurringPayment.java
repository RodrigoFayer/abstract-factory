package com.example.recurring;

import com.example.interfaces.Payment;

public class RecurringPayment implements Payment {
    @Override
    public String process() {
        return "Recurring payment processed";
    }
}
