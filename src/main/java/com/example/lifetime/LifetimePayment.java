package com.example.lifetime;

import com.example.interfaces.Payment;

public class LifetimePayment implements Payment {
    @Override
    public String process() {
        return "Lifetime payment processed";
    }
}
