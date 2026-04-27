package org.climoilou.vetm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void mainTest() {
        assertTrue(true);
    }

    @Test
    void mainTest2() {
        assertTrue(true);
    }

    @Test
    void cesarCipherTest() {
        String result = Main.cesarCipher("bonjour", 1);
        assertTrue(result.equals("cpokpvs"));
    }
}