package com.aditya.csejenkins1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cseAddtest {

    cseAdd c = new cseAdd();

    @Test
    void addTest() {
        int result = c.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void mulTest() {
        int result = c.mul(2, 3);
        assertEquals(6, result);
    }
}