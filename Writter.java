import java.io.*;
public class Writter {
    String hola ="";
    public void wri(int[] Arrayint){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            hola = String.valueOf(Arrayint[0]);
            writer.write(hola);

            for(int i = 1;i <= 10; i++){
                hola = String.valueOf(Arrayint[i]);
                writer.write(" "+hola);
            }
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("No such file exists.");
        }

    }
}
