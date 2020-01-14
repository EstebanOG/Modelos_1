
package singleton;

public class Singleton {
    
    private static Singleton sin;
    private String value;
    private Singleton(){
    }
    
    public static Singleton getInstance(){
        if(sin==null){
            sin = new Singleton();
        }
        return sin;
    }
    
    /*public void sin(String msj){
        System.out.println(msj);
    }*/
    public void setValue(String msj){
        value =msj;
    }
    public String getValue(){
        return value;
    }
    
    
}
