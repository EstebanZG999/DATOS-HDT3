public class Main {
    public static void main(String []args){
        Writter writen = new Writter();
        Reader reade = new Reader();
        CrearDatos datas = new CrearDatos();
        datas.datos(writen);
        Controlador control = new Controlador();
        control.Inicio(reade);

    }
}
