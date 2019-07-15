package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {

    @Test
    public void should_return_true_when_age_is_greater_than_18 () {
        Police police = new Police();
        Driver driver = new Driver(19);
        boolean result = police.checkDriver(driver);

        assertTrue(result);
    }

    @Test
    public void should_return_true_when_age_is_18 () {
        Police police = new Police();
        Driver driver = new Driver(19);
        boolean result = police.checkDriver(driver);

        assertTrue(result);
    }
}
