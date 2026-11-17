
package com.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JUnitSetupTest {

    @Test
    void shouldVerifyAddition() {
        int result = 10 + 20;

        assertEquals(30, result);
    }

    @Test
    void shouldVerifyBooleanCondition() {
        assertTrue(10 > 5);
    }
}
