package com.openlending.credit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquifaxServiceTest {
    @Test
    void equifaxCreditScoreEqual_600() {
        var Equifax = new EquifaxService();
        ;
        assertEquals(600, Equifax.getCreditScore());

    }
}
