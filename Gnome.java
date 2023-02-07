import java.util.*;
public class Gnome {

public static void GnomeSort(int Array[], int n){
    int indice = 0;
    while(indice < 0){
        if(indice == 0){
            indice++;
        }
        if(Array[indice] >= Array[indice-1]){
            indice++;
        }
        else {
            int temporal = 0;
            temporal = Array[indice];
            Array[indice] = Array[indice-1];
            Array[indice-1] = temporal;
            indice--;
        }
    }
    return;
}



}
