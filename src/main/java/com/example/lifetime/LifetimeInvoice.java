package com.example.lifetime;

import com.example.interfaces.Invoice;

public class LifetimeInvoice implements Invoice {
    @Override
    public String generate() {
        return "Lifetime invoice generated";
    }
}
