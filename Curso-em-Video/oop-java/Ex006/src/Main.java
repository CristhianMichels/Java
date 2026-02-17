import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França",
                31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil",
                29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA",
                35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália",
                28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil",
                37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA",
                30, 1.81f, 105.7f, 12, 2, 4);



        Luta UEC01 = new Luta();

        boolean continuar = true;
        while (continuar){
            System.out.println("--------------LUTADORES--------------");
            int c = 1;
            for (Lutador pessoa : l){
                System.out.println(c +" " + pessoa.getNome());
                c++;
            }
            System.out.println("-------------------------------------");
            System.out.println("O que você deseja fazer? ");
            System.out.println("1 - Escolher lutadores");
            System.out.println("2 - Lutar");
            System.out.println("3 - Sair");
            String decisao = "";
            decisao = scanner.nextLine();
            while (!decisao.equals("1") && !decisao.equals("2") && !decisao.equals("3")){
                System.out.print("Por favor digite um número válido! ");
                decisao = scanner.nextLine();
            }
            switch (decisao){
                case "1":
                    System.out.print("Digite o número do lutador 1: ");
                    int l1 = scanner.nextInt();
                    System.out.print("Digite o número do lutador 2: ");
                    int l2 = scanner.nextInt();
                    scanner.nextLine();
                    UEC01.marcarLuta(l[l1 - 1], l[l2 -1]);
                    System.out.println("Situação: " + UEC01.getAprovada());
                    break;

                case "2":
                    if (UEC01.getAprovada()){
                        UEC01.lutar();
                    } else {
                        System.out.println("Luta não aprovada! Possíveis motivos: Você precisa selecionar os \n lutadores primeiro, ou a categoria dos lutadores não batem!");
                    }
                    break;

                case "3":
                    System.out.println("Até mais!");
                    System.out.println("-------------------------------------");
                    continuar = false;
                    break;
            }

        }
        scanner.close();
    }
}
