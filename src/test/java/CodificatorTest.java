import org.junit.jupiter.api.Test;

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

    /*@Test
    void testEncode001_1() {
        Codificator codificator = new Codificator();
        String output = codificator.encode("1");
        assertEquals("1",output);
    }*/
}