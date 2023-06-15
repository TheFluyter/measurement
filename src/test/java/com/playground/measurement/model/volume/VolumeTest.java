package com.playground.measurement.model.volume;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VolumeTest {

    @Test
    void sameVolumeType_shouldBeEqual() {
        assertEquals(new Gallon(1.0), new Gallon(1.0));
        assertEquals(new Quarts(1.0), new Quarts(1.0));
        assertEquals(new Pints(1.0), new Pints(1.0));
        assertEquals(new Cups(1.0), new Cups(1.0));
    }
}