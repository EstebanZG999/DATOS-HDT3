import java.io.*;
public class Writter {
    String hola ="";
    public void wri(int[] Arrayint){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            for(int i = 0;i <= 2999; i++){
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
