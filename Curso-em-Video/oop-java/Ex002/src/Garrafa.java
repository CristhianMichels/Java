import java.util.Scanner;

public class Garrafa {

    Scanner scanner = new Scanner(System.in);

    String marca;
    String material;
    int capacidade;
    boolean cheia;
    boolean tampada;

    void status(){
        System.out.println("--------Status--------");
        msgAcao("Marca: " + this.marca);
        msgAcao("Material: " + this.material);
        msgAcao("Capacidade: " + this.capacidade + " ml");
        msgAcao("Cheia: " + this.cheia);
        msgAcao("Tampada: " + this.tampada);
        msgAcao("----------------------");
    }

    boolean verificar(String msg){
        System.out.print(msg + " S/N ");
        String valor = scanner.nextLine().toLowerCase();
        if (valor.equals("s")){
            return true;
        } else {
            return false;
        }

    }
    void msgAcao(String msg){
        try {
            System.out.println(msg);
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void tampar(){
        tampada = true;
        msgAcao("Você tampou a garrafa");
    }
    void destampar(){
        tampada = false;
        msgAcao("Você destampou a garrafa");
    }
    void encher(){
        if (tampada){
            System.out.println("Você precisa destampar a garrafa para poder enche-la");
            if (verificar("Deseja destampar a garrafa?")){
                destampar();
            }
        } else {
            cheia = true;
            msgAcao("Você encheu a garrafa");
        }

    }
    void esvaziar(){
        if (tampada){
            System.out.println("Você precisa destampar a garrafa para poder esvazia-la");
            if (verificar("Deseja destampar a garrafa?")){
                destampar();
            }
        } else{
            cheia = false;
            msgAcao("Você esvaziou a garrafa");
        }

    }
    void tomar(){
        if (tampada){
            System.out.println("Você precisa destampar a garrafa para poder beber");
            if (verificar("Deseja destampar a garrafa?")){
                destampar();
            }
        } else {
            if (cheia == false){
                System.out.println("A garrafa precisa estar cheia para você tomá-la");
                if (verificar("Deseja encher a garrafa?")){
                    encher();
                }
            } else {
                msgAcao("Parabéns, você se hidratou!");
                esvaziar();
            }
        }
    }
}
