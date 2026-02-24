package projetoyoutube;

public class Main {
    public static void main(String[] args) {

        Usuario g[] = new Usuario[2];

        g[0] = new Usuario("Jubileu", 22, "M", "juba");
        g[1] = new Usuario("Juana", 35, "F", "Ju1");

        System.out.println(g[0].toString());
    }
}
