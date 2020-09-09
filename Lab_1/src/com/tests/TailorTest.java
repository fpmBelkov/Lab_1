package com.tests;

import com.famcs.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class TailorTest {

    @Test
    public void test() {

        double x = -1.1;
        assertEquals(Math.exp(x), Main.tailorSeries(x, -6), 5E-4);
        x = 0;
        assertEquals(Math.exp(x), Main.tailorSeries(x, -6), 5E-4);
        x = 1.1;
        assertEquals(Math.exp(x), Main.tailorSeries(x, -6), 5E-4);
        
    }

}
