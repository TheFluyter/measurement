package com.playground.measurement.model.volume;

public abstract class Volume {

    Double amountInCups;

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Volume volume) {
            return Double.compare(volume.amountInCups, amountInCups) == 0;
        } else {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 31 * hash + amountInCups.intValue();
        return hash;
    }
}
