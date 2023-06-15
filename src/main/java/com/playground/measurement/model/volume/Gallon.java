package com.playground.measurement.model.volume;

public class Gallon extends Volume {

    public Gallon(double amount) {
        this.amountInCups = amount * 16;
    }
}
