package Kyu5.LastDigitOfALargeNumber;


import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class LastDigitOfALargeNumberTest {

    @Test
    public void calculate() throws Exception {
        assertEquals(8, Kata.lastDigit(new BigInteger("2"), new BigInteger("7")));
        assertEquals(4, Kata.lastDigit(new BigInteger("4"), new BigInteger("1")));
        assertEquals(6, Kata.lastDigit(new BigInteger("4"), new BigInteger("2")));
        assertEquals(9, Kata.lastDigit(new BigInteger("9"), new BigInteger("7")));
    }

}
