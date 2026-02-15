import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ContaBanco conta1 = new ContaBanco();

        conta1.abrirConta("Pessoa1","CC", 21);
        TimeUnit.SECONDS.sleep(1);
        conta1.sacar(10);
        TimeUnit.SECONDS.sleep(1);
        conta1.pagarMensal();

    }
}
