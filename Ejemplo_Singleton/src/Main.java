
public class Main {
    
    public static void main(String[] args) {
        //Instanciación del contructor porhíbido por ser "Private"
        //Singleton s = new Singleton();
        Singleton s = Singleton.getInstancia();
        s.conectar();
        s.desconectar();
        
        boolean rpta = s instanceof Singleton;
        System.out.println(rpta);
    }
}
