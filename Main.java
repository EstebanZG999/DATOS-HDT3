public class Main {
    public static void main(String []args){
        boolean loop = true;
        while(loop == true) {
            Writter writen = new Writter();
            Reader reade = new Reader();
            CrearDatos datas = new CrearDatos();
            datas.datos(writen);
            Controlador control = new Controlador();
            control.Inicio(reade);
        }

    }
    //C:\Users\Usuario\Documents\GitHub\DATOS-HDT3\test.txt
}
