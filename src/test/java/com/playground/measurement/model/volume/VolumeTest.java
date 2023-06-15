package com.playground.measurement.model.volume;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VolumeTest {

    @Test
    void sameVolumeType_shouldBeEqual() {
        assertEquals(new Gallon(1), new Gallon(1));
        assertEquals(new Quart(1), new Quart(1));
        assertEquals(new Pint(1), new Pint(1));
        assertEquals(new Cup(1), new Cup(1));
    }

    @Test
    void differentVolumes_shouldBeEqual() {
        assertEquals(new Gallon(1), new Quart(4));
        assertEquals(new Quart(4), new Pint(8));
        assertEquals(new Pint(8), new Cup(16));
    }
}