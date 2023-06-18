package com.playground.measurement.model.volume;

public class Measurement {

    private final Number amount;
    private final MeasurementUnit unit;

    public Measurement(Number amount, MeasurementUnit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Measurement)) return false;
        return Double.compare(amount.doubleValue(), ((Measurement) other).amount.doubleValue()) == 0;
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 31 * hash + amount.intValue();
        return hash;
    }

    static class MeasurementUnit {

        private final int baseAmount;
        private final MeasurementUnit baseUnit;

        static MeasurementUnit oz = new MeasurementUnit();

        MeasurementUnit() {
            this.baseAmount = 1;
            this.baseUnit = this;
        }

        MeasurementUnit(int baseAmount, MeasurementUnit baseUnit) {
            this.baseAmount = baseAmount;
            this.baseUnit = baseUnit;
        }
    }
}
