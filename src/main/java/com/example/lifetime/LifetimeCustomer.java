package com.example.lifetime;

import com.example.interfaces.Customer;

public class LifetimeCustomer implements Customer {
    @Override
    public String describe() {
        return "Lifetime customer";
    }
}
