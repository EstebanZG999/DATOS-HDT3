import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixTest {
    int[] DesArray = {2,0,3,1};
    int[] OrdArray = {0,1,2,3};

    /*@Test
    void maximo() {
        Radix.maximo(DesArray, 2);
        assertArrayEquals(OrdArray, DesArray);
    }

    @Test
    void contararr() {
        Radix.contararr(DesArray, 1, 1);
        assertArrayEquals(OrdArray, DesArray);
    }*/

    @Test
    void contarRadix() {
        assertArrayEquals(Radix.contarRadix(DesArray, DesArray.length), OrdArray);
    }
}