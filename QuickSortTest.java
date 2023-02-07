import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    int[] DesArray = {2,0,3,1};
    int[] OrdArray = {0,1,2,3};

    @Test
    void particion() {
        QuickSort.arreglar(DesArray, 0, 3);
        assertArrayEquals(OrdArray, DesArray);
    }
}