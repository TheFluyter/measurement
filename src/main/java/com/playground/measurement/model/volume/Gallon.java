package com.playground.measurement.model.volume;

public class Gallon {

    private final Double amount;

    public Gallon(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Gallon gallon) {
            return Double.compare(gallon.amount, amount) == 0;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + amount.intValue();
        return hash;
    }
}
