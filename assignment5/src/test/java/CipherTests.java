import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import edu.wpi.cs3733.entity.HashCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
    @Test
    public void CaesarCipherTest1() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "BCDEFGHIJKLMNOPQRSTUVWXYZA");
    }

    @Test
    public void CaesarCipherTest2() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("abcdefghijklmnopqrstuvwxyz"), "bcdefghijklmnopqrstuvwxyza");
    }

    @Test
    public void CaesarCipherTest3() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("Check space shifting"), "Difdl tqbdf tijgujoh");
    }

    @Test
    public void CaesarCipherTest4() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion(" "), " ");
    }

    @Test
    public void CaesarCipherTest5() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("This is a message"), "Uijt jt b nfttbhf");
    }

    @Test
    public void HashCipherTest1() {
        HashCipher hashCipher = new HashCipher();
        assertEquals(hashCipher.hashCipherConversion("TESTING "), "TESTING ".hashCode());
    }

    @Test
    public void HashCipherTest2() {
        HashCipher hashCipher = new HashCipher();
        assertEquals(hashCipher.hashCipherConversion("Z 1 8 9 3 098765HJAFKZL "), "Z 1 8 9 3 098765HJAFKZL ".hashCode());
    }

    @Test
    public void HashCipherTest3() {
        HashCipher hashCipher = new HashCipher();
        assertEquals(hashCipher.hashCipherConversion(" "), " ".hashCode());
    }

    @Test
    public void ElbonianCipherTest1() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("a "), "127");
    }

    @Test
    public void ElbonianCipherTest2() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("ABCDEFGHIJKLMNOPQRSTUVWXYZ "), "123456789101112131415161718192021222324252627");
    }

    @Test
    public void ElbonianCipherTest3() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("abcdefghijklmnopqrstuvwxyz "), "123456789101112131415161718192021222324252627");
    }

    @Test
    public void ElbonianCipherTest4() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("CaSe ChEcK"), "3119527385311");
    }
}
