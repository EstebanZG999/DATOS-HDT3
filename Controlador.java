import java.util.Scanner;

public class Controlador {
    int[] Arrayint = new int[11];
    String[] ArrayString = new String[11];
    Scanner sc = new Scanner(System.in);
    String res = "";

    String Numeros = "";

    public void Inicio(Reader reade) {
        Numeros = Reader.read();
        ArrayString = Numeros.split(" ");
        for (int i = 0; i <= 10; i++) {
            Arrayint[i] = Integer.valueOf(ArrayString[i]);
        }
        System.out.println("\nEscoja una de los distintos tipos de sort: ");
        System.out.println("1. GnomeSort, 2. MergeSort \n3. QuickSort, 4.RadixSort, 5. BubbleSort");









    }

    public void QuickSort(int array[], int low, int high) {
        int pivote = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivote) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i+1;
        }

    }
}