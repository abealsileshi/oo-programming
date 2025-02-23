package org.coursera.lab.strategy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.coursera.lab.strategy.Main;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void strategyTest() {
        assertTrue(true);
    }

    //use this to create and run tests of your own
       @Test
       public void strategyTest() {
           Car c = new Coupe();
           assertTrue(c instanceof Coupe);
       }

}
