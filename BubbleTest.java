import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleTest {
    int[] DesArray = {2,0,3,1};
    int[] OrdArray = {0,1,2,3};

    @Test
    void bubbleSort() {
        Bubble.BubbleSort(DesArray);
        assertArrayEquals(OrdArray, DesArray);
    }
}