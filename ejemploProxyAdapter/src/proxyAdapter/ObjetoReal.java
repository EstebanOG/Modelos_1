package proxyAdapter;

public class ObjetoReal implements Interface{

    @Override
    public void proceso() {
        System.out.println("Proceso de objeto real");
    }
}
