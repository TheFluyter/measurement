package com.playground.measurement.model.volume;

public class Pints {

    private final Double amount;

    public Pints(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Pints pints) {
            return Double.compare(pints.amount, amount) == 0;
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
