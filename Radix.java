import java.io.*;
import java.util.*;

public class Radix {

    static int maximo(int[] array, int u){
        int max = array[0];
        for (int i = 1; i < u; i++)
            if(array[i] > max)
                max = array[i];
        return max;
    }

    static void contararr(int[] array, int u, int exp){
        int[] salida = new int[u];
        int i;
        int[] contar = new int[10];
        Arrays.fill(contar, 0);

        for (i = 0; i < u; i++) {
            contar[(array[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++) {
            contar[i] += contar[i-1];
        }

        for (i = u - 1; i >= 0; i--) {
            salida[contar[(array[i] / exp) % 10] - 1] = array[i];
            contar[(array[i] / exp) % 10]--;
        }

        for (i = 0; i < u; i++)
            array[i] = salida[i];
    }

    static int[] contarRadix(int[] array, int u){
        int n = maximo(array, u);

        for(int exp = 1; n / exp > 0; exp *=10)
            contararr(array, u, exp);
        return array;
    }
}
