import module.Codificator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CodificatorTest {

    @Test   //005 --> lunghezza della stringa   1 --> progressivo per test di questa lunghezza
    void testEncode005_1() {
        Codificator codificator = new Codificator();
        String output = codificator.encode("01010");
        assertEquals("11011",output);
    }

    @Test
    void testEncode005_2() {
        Codificator codificator = new Codificator();
        String output = codificator.encode("10001");
        assertEquals("11011",output);
    }

    @Test
    void testEncode010_1() {
        Codificator codificator = new Codificator();
        String output = codificator.encode("0101000101");
        assertEquals("1101101101",output);
    }

    @Test
    void testEncodeEmptyString() {
        Codificator codificator = new Codificator();
        String output = codificator.encode("");
        assertEquals("",output);
    }

    @ParameterizedTest
    @CsvSource({
            "01010, 11011",
            "10001, 11011",
            "0101000101, 1101101101",
            "'', ''",
    })
    void testLevels(String input, String outputExpected) {
        Codificator codificator = new Codificator();
        String output = codificator.encode(input);
        assertEquals(outputExpected,output);
    }
}