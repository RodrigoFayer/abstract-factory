package com.example.recurring;

import com.example.interfaces.Invoice;

public class RecurringInvoice implements Invoice {
    @Override
    public String generate() {
        return "Recurring invoice generated";
    }
}
