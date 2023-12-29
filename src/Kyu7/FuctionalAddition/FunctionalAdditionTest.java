package Kyu7.FuctionalAddition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalAdditionTest {

    @Test
    public void testMethod() {
        assertEquals("Kata.add(3,5)", Kata.add(3).applyAsInt(5), 8);
    }

}
