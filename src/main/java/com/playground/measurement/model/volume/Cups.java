package com.playground.measurement.model.volume;

public class Cups {

    private final Double amount;

    public Cups(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Cups cups) {
            return Double.compare(cups.amount, amount) == 0;
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
