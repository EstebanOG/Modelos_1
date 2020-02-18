package proxyAdapter;

public class ObjetoProxy implements Interface{

    @Override
    public void proceso() {
        ObjetoReal real = new ObjetoReal();
        real.proceso();
    }
}
