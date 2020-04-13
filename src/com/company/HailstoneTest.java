package com.company;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HailstoneTest {

    @org.junit.Test
    public void aHailstoneLength() {
        assertEquals(10, Hailstone.hailstoneLength(13));
    }

    @org.junit.Test
    public void bHailstoneLength() {
        assertEquals(7, Hailstone.hailstoneLength(10));
    }

    @Test
    public void cIsLongSeq() {
        assertTrue(Hailstone.isLongSeq(5));
    }

    @Test
    public void dIsLongSeq() {
        assertFalse(Hailstone.isLongSeq(8));
    }

    @Test
    public void ePropLong() {
        assertEquals(0.5, Hailstone.propLong(10), 0);
    }

    @Test
    public void fPropLong() {
        assertEquals(0.434, Hailstone.propLong(23), .001);
    }

}