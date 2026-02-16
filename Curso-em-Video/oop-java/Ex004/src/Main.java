import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ContaBanco conta1 = new ContaBanco();

        conta1.abrirConta("Jubileu","CC", 11111);
        TimeUnit.SECONDS.sleep(1);
        conta1.depositar(300);
        TimeUnit.SECONDS.sleep(1);
        conta1.pagarMensal();

        ContaBanco conta2 = new ContaBanco();

        conta2.abrirConta("Creusa", "CP", 22222);
        TimeUnit.SECONDS.sleep(1);
        conta2.depositar(500);
        TimeUnit.SECONDS.sleep(1);
        conta2.pagarMensal();
        TimeUnit.SECONDS.sleep(1);
        conta2.sacar(200);
        TimeUnit.SECONDS.sleep(1);
        conta2.sacar(80);
        TimeUnit.SECONDS.sleep(1);

    }
}
