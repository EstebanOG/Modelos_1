package proxyAdapter;

public class Cliente {

    public static void main(String[] args) {
        Interface objeto = new ObjetoProxy();
        objeto.proceso();
        ObjetoAdapter objeto2 = new ObjetoAdapter();
        objeto2.proceso();
    }
}
