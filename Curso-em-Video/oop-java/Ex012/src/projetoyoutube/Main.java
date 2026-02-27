package projetoyoutube;

public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Vídeo HTML");
        v[1] = new Video("Vídeo CSS");
        v[2] = new Video("Vídeo JavaScript");


        Usuario g[] = new Usuario[2];

        g[0] = new Usuario("Jubileu", 22, "M", "juba");
        g[1] = new Usuario("Juana", 35, "F", "Ju1");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]); // Jubileu assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]); //Jubileu assiste CSS
        vis[1].avaliar(90.0f);
        System.out.println(vis[1].toString());
    }
}
