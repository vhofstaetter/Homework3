package net.htlgkr.hove.pos3.hausuebung3;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void testAverage() {
        Numbers numbers = new Numbers();
        double expected = 7.0;
        int[] numbersarray = new int[5];
        numbersarray[0] = 4;
        numbersarray[1] = 7;
        numbersarray[2] = 4;
        numbersarray[3] = 8;
        numbersarray[4] = 12;
        double result = numbers.average(numbersarray);
        assertEquals(expected, result);
    }

}