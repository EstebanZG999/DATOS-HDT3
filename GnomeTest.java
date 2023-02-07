import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class GnomeTest {
    int[] DesArray = {2,0,3,1};
    int[] OrdArray = {0,1,2,3};

    @org.junit.jupiter.api.Test
    void gnomeSort() {
        Gnome.GnomeSort(DesArray, DesArray.length);
        assertArrayEquals(OrdArray, DesArray);
    }
}