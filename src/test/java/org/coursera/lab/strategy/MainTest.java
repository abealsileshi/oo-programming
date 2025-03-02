package org.coursera.lab.strategy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.coursera.lab.strategy.MainStrategy;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void strategyTestOne() {
        assertTrue(true);
    }
    //use this to create and run tests of your own
       @Test
       public void strategyTest() {
           Car c = new Coupe(new RacingHandling());
           assertTrue(c instanceof Coupe);

           Car c1 = new Coupe(new SafetyHandling());
           assertTrue(c1 instanceof Coupe);

           Car c2 = new Coupe(new SportHandling());
           assertTrue(c2 instanceof Coupe);

           Car c3 = new Convertible(new SportHandling());
           assertTrue(c3 instanceof Convertible);
       }

}
