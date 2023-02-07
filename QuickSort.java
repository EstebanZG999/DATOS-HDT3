import java.util.*;

public class QuickSort {


    int particion(int[] array, int low, int high){

        int pivote = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivote) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i+1;
    }

    void arreglar(int[] array, int low, int high){
        if(low<high){
            int indice = particion(array, low, high);

            arreglar(array, low, indice-1);
            arreglar(array, indice+1, high);
        }
    }


}