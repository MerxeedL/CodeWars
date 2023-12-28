package Kyu6.DecodeTheMorseCode;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class DecodeTheMorseCodeTest {

    @Test
    public void test() {
        assertThat(Kata.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
        assertThat(Kata.decode("...---..."), is("SOS"));
    }

}
