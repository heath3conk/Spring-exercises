package com.allstate.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

    @Test
    public void shouldSquareAnInteger() throws Exception {
        assertEquals(Math.square(5), 25);
    }
}
