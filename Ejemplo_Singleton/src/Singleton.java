
public class Singleton {
    //Declaracion
    private static Singleton instancia;
    //private static Singleton instancia = new Singleton();
    
    //Para evitar instancia mediante operador new
    private Singleton(){
        
    }
    
    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Singleton getInstancia(){
        if(instancia==null){
            instancia = new Singleton();
        }
        return instancia;
    }
    
    //Metodo de prueba
    public void conectar(){
        System.out.println("Me conecté a la BD");
    }
    
    //Metodo de prueba
    public void desconectar(){
        System.out.println("Me denconecté de la BD");
    }
    
}
