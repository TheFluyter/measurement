package com.playground.measurement.model.volume;

public class Pint extends Volume {

    public Pint(double amount) {
        this.amountInCups = amount * 2;
    }
}
