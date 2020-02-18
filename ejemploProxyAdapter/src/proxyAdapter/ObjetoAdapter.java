package proxyAdapter;

public class ObjetoAdapter implements Interface{
    
    @Override
    public void proceso() {
        ObjetoRemoto remoto = new ObjetoRemoto();
        remoto.doSomething();
    }
}
