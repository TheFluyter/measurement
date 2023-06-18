package com.playground.measurement.model.volume;

import org.junit.jupiter.api.Test;

import static com.playground.measurement.model.volume.Measurement.MeasurementUnit.oz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MeasurementTest {

    @Test
    void sameVolumeType_shouldBeEqual() {
        assertEquals(new Measurement(1, oz), new Measurement(1, oz));
        assertNotEquals(new Measurement(1, oz), new Measurement(5, oz));
    }
}

//    static MeasurementUnit oz = new MeasurementUnit();
//    static MeasurementUnit gill = new MeasurementUnit(5, oz);
//    static MeasurementUnit pint = new MeasurementUnit(4, gill);
//    static MeasurementUnit quart = new MeasurementUnit(2, pint);
//    static MeasurementUnit gallon = new MeasurementUnit(4, quart);