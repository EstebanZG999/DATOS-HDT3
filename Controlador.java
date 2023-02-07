import java.util.Arrays;
import java.util.Scanner;

public class Controlador {
    int[] Arrayint = new int[11];
    String[] ArrayString = new String[11];
    Scanner sc = new Scanner(System.in);
    int res = 0;
    int u = Arrayint.length;

    String Numeros = "";

    public void Inicio(Reader reade) {
        Numeros = Reader.read();
        ArrayString = Numeros.split(" ");
        for (int i = 0; i <= 10; i++) {
            Arrayint[i] = Integer.valueOf(ArrayString[i]);
        }
        System.out.println("\nEscoja una de los distintos tipos de sort: ");
        System.out.println("1. GnomeSort, 2. MergeSort \n3. QuickSort, 4.RadixSort, 5. BubbleSort");
        res = sc.nextInt();
        if(res == 1){
            Gnome gnomos = new Gnome();
            gnomos.GnomeSort(Arrayint,u);
        }

        if(res == 2){

        }
        if(res == 3){
            QuickSort quicks = new QuickSort();
            quicks.arreglar(Arrayint, 0, u-1);
        }
        if(res == 4){
            Radix radi = new Radix();
            radi.contarRadix(Arrayint, u);

        }
        if(res == 5){
            Bubble bbubble = new Bubble();
            bbubble.BubbleSort(Arrayint);
        }
        
        System.out.println(Arrays.toString(Arrayint));



    }


}