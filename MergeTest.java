import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {
    int[] DesArray = {2,0,3,1};
    int[] OrdArray = {0,1,2,3};

    @Test
    void merge() {
        Merge.contar(DesArray, 0, DesArray.length-1);
        assertArrayEquals(OrdArray, DesArray);
    }
}