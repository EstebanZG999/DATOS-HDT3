import java.util.*;

public class CrearDatos {

    Scanner sc = new Scanner(System.in);
    int[] Arrayint = new int[11];
    int Resp = 0;
    Random rand = new Random();

    public void datos(Writter writen){

        System.out.println("Elija el tipo de datos que desea: 1.Organizados 2.Aleatorio");
        Resp = sc.nextInt();
        if(Resp == 1){
            DatsOrga();
        }
        if(Resp == 2){
            DatsOrga();
            Shuffle();
        }
        writen.wri(Arrayint);


    }
    public void DatsOrga(){
        for(int i = 0;i <= 10;i++){
            Arrayint[i] = i;
        }
    }

    public void Shuffle(){
        for (int i = 0; i < Arrayint.length; i++) {
            int randomIndexToSwap = rand.nextInt(Arrayint.length);
            int temp = Arrayint[randomIndexToSwap];
            Arrayint[randomIndexToSwap] = Arrayint[i];
            Arrayint[i] = temp;
        }
    }
}

